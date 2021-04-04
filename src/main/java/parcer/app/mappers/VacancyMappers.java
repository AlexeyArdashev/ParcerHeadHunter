package parcer.app.mappers;


import parcer.app.dto.Vacancy;
import org.mapstruct.Mapper;
import parcer.app.vo.VacancyVO;

@Mapper(componentModel = "spring",
        uses = {AreaMappers.class, KeySkillMappers.class, SpecializationMappers.class,
        SalaryMappers.class, EmployerMappers.class, ExperiensMappers.class})
public abstract class VacancyMappers {
    /**
     * Преобразование.
     *
     * @param vo объект
     * @return dto
     */

    public abstract Vacancy toDto(VacancyVO vo);
    /**
     * Преобразование.
     *
     * @param dto объект
     * @return dto
     */

    public  abstract VacancyVO toVO(Vacancy dto);
}



