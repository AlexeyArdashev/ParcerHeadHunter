package parcer.app.service;


import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import parcer.app.dto.Vacancy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class HeadHunterClient {
    final int maxPerPageValue = 100;
    final int LimitGetVacancy = 2000;
    final int MaxIteration = LimitGetVacancy / maxPerPageValue;
    private final RestTemplate restTemplate = new RestTemplate();
    final String templateUrl = "https://api.hh.ru/vacancies";

    ArrayList <String> idVacancyes = new ArrayList <String>();
    public final ArrayList <String> getIdVacancyes() { return idVacancyes; }
    public boolean FillingIdVacacyesToday () {

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy-MM-dd");
        String today = formatForDateNow.format( new Date() );
        System.out.println("Запрос на получение вакансий, опубликованных с " + today);
        StringBuilder firstPartRequest = new StringBuilder();
        firstPartRequest.append(templateUrl);
        firstPartRequest.append("?");
        firstPartRequest.append("date_from="+ today + "&");
        StringBuilder secondPartReques = new StringBuilder();
        try {
            for (int i = 0; i < MaxIteration; i++) {
                secondPartReques.append(String.valueOf(i));
                secondPartReques.append("&per_page=");
                secondPartReques.append(String.valueOf(maxPerPageValue));
                System.out.println("Выполение запроса: " +
                        firstPartRequest.toString() + secondPartReques.toString());
                PageVacancies stringPosts = restTemplate.getForObject(
                        firstPartRequest.toString() + secondPartReques.toString(), PageVacancies.class);

                for (PropertiosForGetVacansy item : stringPosts.getItems()) {
                    idVacancyes.add(item.getIdVacansy());
                }
                secondPartReques.setLength(0);
            }
        }
        catch (RestClientException ex) {
            ex.printStackTrace();
            return false;
        }
        System.out.println("Успешно. Получено идентификаторов вакансий " + idVacancyes.size());
        return true;
    }

    public Vacancy getVacancy ( String id ) {
        Vacancy rezult = new Vacancy();
        StringBuilder request = new StringBuilder();
        request.append(templateUrl);
        request.append("/");
        request.append(id);
        System.out.println("Запрос на получение вакансии: " + request.toString());
        try {
            rezult = restTemplate.getForObject(request.toString(), Vacancy.class);
        } catch (RestClientException ex) {
            System.out.println(ex.getMessage());
            return rezult;
        }
        rezult.setDescription(html2text(rezult.getDescription()));
        return rezult;
    }
    private static String html2text(String html) {
        return Jsoup.parse(html).text();
    }
}
