package parcer.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class StartApplcation {
    @Autowired
    FinderVacancy finderVacancy;
    @PostConstruct
    void init() {
        finderVacancy.runFindVacancies();
    }
}
