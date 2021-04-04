package parcer.app.mappers;
import parcer.app.dto.Area;
import parcer.app.vo.AreaVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class AreaMappers {
    /**
     * Преобразование.
     *
     * @param vo объект
     * @return dto
     */
    public abstract Area toDto(AreaVO vo);
    /**
     * Преобразование.
     *
     * @param dto объект
     * @return dto
     */
    public abstract AreaVO toVO(Area dto);
}
