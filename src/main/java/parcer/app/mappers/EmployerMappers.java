package parcer.app.mappers;

import org.mapstruct.Mapper;
import parcer.app.dto.Employer;
import parcer.app.vo.EmployerVO;

@Mapper(componentModel = "spring")
public abstract class EmployerMappers {
    /**
     * Преобразование.
     *
     * @param vo объект
     * @return dto
     */
    public abstract Employer toDto(EmployerVO vo);
    /**
     * Преобразование.
     *
     * @param dto объект
     * @return dto
     */
    public abstract EmployerVO toVO(Employer dto);
}
