package parcer.app.service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import parcer.app.mappers.VacancyMappers;


import javax.annotation.PostConstruct;


//@Configuration
@Service
public class StartApplcation {
    @Autowired
    FinderVacancy finderVacancy;
    @PostConstruct
    void init() {
        finderVacancy.runFindVacancies();
    }


}
