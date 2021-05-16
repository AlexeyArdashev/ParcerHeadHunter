package parcer.app.mappers;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import parcer.app.dto.KeySkill;
import parcer.app.repositories.KeySkillRepository;
import parcer.app.vo.KeySkillVO;

import java.util.Optional;
import java.util.UUID;


@Mapper(componentModel = "spring")
public class KeySkillMappers {
    /**
     * Преобразование.
     *
     * @param vo объект
     * @return dto
     */

    @Autowired
    KeySkillRepository keySkillRepository;

    public KeySkill toDto(KeySkillVO vo) {
        KeySkill fromVO = new KeySkill();
        fromVO.setId( vo.getId());
        fromVO.setName( (vo.getName()));
        return fromVO;
    }
    /**
     * Преобразование.
     *
     * @param dto объект
     * @return dto
     */
    public KeySkillVO toVO(KeySkill dto) {
        Optional<KeySkillVO> rezult = keySkillRepository.findByName(dto.getName());
        if (rezult.isPresent()) {
          //  System.out.println("finde! " + rezult.get().getName());
            return rezult.get();
        }
        return ( new KeySkillVO(UUID.randomUUID(), dto.getName()) );
    }
}
