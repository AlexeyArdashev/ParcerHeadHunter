package parcer.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import parcer.app.repositories.*;
import parcer.app.vo.*;

import java.util.List;
import java.util.Optional;

@Service
public class SaverToDataBase {
  //  @Autowired
   // private KeySkillRepository skillRepository;
    @Autowired
    private VacancyRepository vacancyRepository;
    @Autowired
    private EmployerRepository employerRepository;
   // @Autowired
   // private ExperiensRepository experiensRepository;
    @Autowired
    private SpecializationRepository specializationRepository;
    @Autowired
    private AreaRepository areaRepository;

    public boolean saveToDataBase( VacancyVO vacVo ) {
        System.out.println("---------------------*****************---------------------");
        System.out.printf("Начало сохранения данных вакансии %s в БД\n", vacVo.getId());
        Optional<AreaVO> area = areaRepository.findById(vacVo.getArea().getId());
        System.out.println("Сохранение данных о местополежении вакансии");
        if (!area.isPresent()) {
            areaRepository.saveAndFlush(vacVo.getArea());
        }
        System.out.println("Сохранение данных компании, разместившей вакансию");
        if ( vacVo.getEmployer() != null  && vacVo.getEmployer().getId() != null) {
            Optional<EmployerVO> employer = employerRepository.findById(vacVo.getEmployer().getId());
            if (!employer.isPresent()) {
                employerRepository.saveAndFlush(vacVo.getEmployer());
            }
        }
        else {
            System.out.println("Не удалось сохранить данные о компании. ");
            return false;
        }
       // System.out.println("Сохранение данных требуемого опыта работы");
       // System.out.printf ("Значение experience %1\n",vacVo.getExperiens() != null);
      //  Optional<ExperiensVO> experiens = experiensRepository.findById(vacVo.getExperiens().getId());
      //  if (!experiens.isPresent()) {
      //      experiensRepository.saveAndFlush(vacVo.getExperiens());
     //   }

      //  System.out.println("Сохранение ключевых навыков");
    //    saveKeySkils( vacVo.getKey_skills() );
        System.out.println("Сохранение данных о професиональной области");
        saveSpecializations(vacVo.getSpecializations());
        System.out.println("Сохранение полного описания вакансии");
        Optional<VacancyVO> fromDB = vacancyRepository.findById(vacVo.getId());
        if (!fromDB.isPresent()) {
            vacancyRepository.saveAndFlush(vacVo);
        }
        return true;
    }
/*
    private void saveKeySkils(List<KeySkillVO> skils) {
        for (KeySkillVO skill : skils) {
            Optional<KeySkillVO> skillOpt = skillRepository.findByName(skill.getName());
            if (!skillOpt.isPresent()) {
                try {
                    skill.setId(UUID.randomUUID());
                    skillRepository.saveAndFlush(skill);
                } catch (Exception ex) {
                    System.out.println("Ключевой навык " + skill.getName() + " не сохранен");
                }
            }
        }
    }
 */

    private void saveSpecializations(List<SpecializationVO> specializations) {
        for (SpecializationVO specialization : specializations) {
            Optional<SpecializationVO> specializationOpt =
                    specializationRepository.findById(specialization.getId());
            if (!specializationOpt.isPresent()) {
                try {
                    specializationRepository.saveAndFlush(specialization);
                } catch (Exception ex) {
                    System.out.println("Специализация " + specialization.getName() + " не сохранена");
                }
            }
        }
    }
}
