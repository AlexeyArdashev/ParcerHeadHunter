package parcer.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import parcer.app.dto.KeySkill;
import parcer.app.dto.Vacancy;
import parcer.app.mappers.KeySkillMappers;
import parcer.app.mappers.VacancyMappers;
import parcer.app.repositories.KeySkillRepository;
import parcer.app.vo.KeySkillVO;
import parcer.app.vo.VacancyVO;

import javax.persistence.Entity;
import javax.transaction.Transactional;
import java.util.ArrayList;


@Service
public class FinderVacancy {

@Autowired
private VacancyMappers vacancyMappers;

@Autowired
private KeySkillMappers keySkillMappers;

@Autowired
private KeySkillRepository skillRepository;

    public void runFindVacancies() {

        final RestTemplate restTemplate = new RestTemplate();
        try {
            final String templateUrl = "https://api.hh.ru/vacancies/";
            StringBuilder buldReques = new StringBuilder();
            buldReques.append(templateUrl);
            //  Vacancy stringPosts = restTemplate.getForObject("https://api.hh.ru/vacancies/4694457", Vacancy.class);
            PageVacancies stringPosts = restTemplate.getForObject("https://api.hh.ru/vacancies?date_from=2021-04-01", PageVacancies.class); //&page=19&per_page=20

            for (PropertiosForGetVacansy propertios : stringPosts.getItems()) {
                buldReques.append(propertios.getIdVacansy());
                try {
                    Vacancy vacancy = restTemplate.getForObject(buldReques.toString(), Vacancy.class);
                    ArrayList<KeySkill> keySkills = vacancy.getKey_skills();
                    for (KeySkill skill : keySkills) {
                        VacancyVO toVo = vacancyMappers.toVO(vacancy);
                        KeySkillVO toDataBase = keySkillMappers.toVO(skill);
                       // skillRepository.saveAndFlush(toDataBase);
                    }
                } catch (RestClientException ex) {
                    System.out.println(ex.getMessage());
                }
                buldReques.delete(templateUrl.length(), buldReques.length());
            }
        } catch (RestClientException ex) {
            ex.printStackTrace();
        }
    }

    private void AddVacancyToDataBase(Vacancy vac) {

    }
}
