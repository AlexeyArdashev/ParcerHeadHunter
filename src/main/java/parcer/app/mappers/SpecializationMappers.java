package parcer.app.mappers;

import org.mapstruct.Mapper;
import parcer.app.dto.Specialization;
import parcer.app.vo.SpecializationVO;

@Mapper(componentModel = "spring")
public abstract class SpecializationMappers {
    /**
     * Преобразование.
     *
     * @param vo объект
     * @return dto
     */
    public abstract Specialization toDto(SpecializationVO vo);

    /**
     * Преобразование.
     *
     * @param dto объект
     * @return dto
     */
    public abstract SpecializationVO toVO(Specialization dto);
}
