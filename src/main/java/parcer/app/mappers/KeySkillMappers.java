package parcer.app.mappers;
import org.mapstruct.Mapper;
import parcer.app.dto.KeySkill;
import parcer.app.vo.KeySkillVO;


@Mapper(componentModel = "spring")
public abstract class KeySkillMappers {
    /**
     * Преобразование.
     *
     * @param vo объект
     * @return dto
     */
    public abstract KeySkill toDto(KeySkillVO vo);
    /**
     * Преобразование.
     *
     * @param dto объект
     * @return dto
     */
    public abstract KeySkillVO toVO(KeySkill dto);
}
