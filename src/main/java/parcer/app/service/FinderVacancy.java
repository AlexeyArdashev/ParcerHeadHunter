package parcer.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import parcer.app.dto.Vacancy;
import parcer.app.mappers.VacancyMappers;
import java.util.ArrayList;

@Service
public class FinderVacancy {
    @Autowired
    private VacancyMappers vacancyMappers;
    @Autowired
    private SaverToDataBase saverToDataBase;
    @Autowired
    private HeadHunterClient hhClient;
    public void runFindVacancies() {

        hhClient.FillingIdVacacyesToday();
        ArrayList <String> vacanciesOnId = hhClient.getIdVacancyes();
        for ( String id : vacanciesOnId ) {
            Vacancy vac = hhClient.getVacancy( id );
            System.out.println("Получена вакансия: " + vac.getId() + "  Название: " +
                    vac.getName());
            saverToDataBase.saveToDataBase( vacancyMappers.toVO(vac));
        }
    }
}
