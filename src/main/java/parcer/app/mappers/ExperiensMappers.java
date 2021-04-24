package parcer.app.mappers;

import org.mapstruct.Mapper;
import parcer.app.dto.Experiens;
import parcer.app.vo.ExperiensVO;

@Mapper(componentModel = "spring")
public abstract class ExperiensMappers {
    /**
     * Преобразование.
     *
     * @param vo объект
     * @return dto
     */
    public abstract Experiens toDto(ExperiensVO vo);

    /**
     * Преобразование.
     *
     * @param dto объект
     * @return dto
     */
    public abstract ExperiensVO toVO(Experiens dto);
}
