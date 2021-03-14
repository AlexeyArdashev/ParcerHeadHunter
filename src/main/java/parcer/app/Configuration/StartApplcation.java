package parcer.app.Configuration;
import org.jsoup.Jsoup;
import org.jsoup.examples.HtmlToPlainText;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import parcer.app.dto.Vacancy;

import javax.annotation.PostConstruct;


@Configuration
public class StartApplcation {

    @PostConstruct
    void runFindVacancies(){

        final RestTemplate restTemplate = new RestTemplate();
        try {
            final String templateUrl = "https://api.hh.ru/vacancies/";
            StringBuilder buldReques = new StringBuilder();
            buldReques.append(templateUrl);
          //  Vacancy stringPosts = restTemplate.getForObject("https://api.hh.ru/vacancies/4694457", Vacancy.class);
            PageVacancies stringPosts = restTemplate.getForObject("https://api.hh.ru/vacancies?date_from=2021-03-01", PageVacancies.class); //&page=19&per_page=20

            for (PropertiosForGetVacansy propertios : stringPosts.getItems()) {
                buldReques.append(propertios.getIdVacansy());
                try {
                    Vacancy vacancy = restTemplate.getForObject(buldReques.toString(), Vacancy.class);
                    System.out.println("//////////");
                    String plain = new HtmlToPlainText().getPlainText(Jsoup.parse(vacancy.description));
                    System.out.println(plain);
                }
                catch (RestClientException ex) {
                   System.out.println(ex.getMessage());
                }
                buldReques.delete(templateUrl.length(),buldReques.length());
            }
        }
        catch (RestClientException ex) {
            ex.printStackTrace();
        }
    }
}
