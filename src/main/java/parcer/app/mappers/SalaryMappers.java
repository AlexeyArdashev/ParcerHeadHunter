package parcer.app.mappers;

import org.mapstruct.Mapper;
import parcer.app.dto.Salary;
import parcer.app.vo.SalaryVO;

@Mapper(componentModel = "spring")
public abstract class SalaryMappers {
    /**
     * Преобразование.
     *
     * @param vo объект
     * @return dto
     */
    public abstract Salary toDto(SalaryVO vo);

    /**
     * Преобразование.
     *
     * @param dto объект
     * @return dto
     */
    public abstract SalaryVO toVO(Salary dto);
}
