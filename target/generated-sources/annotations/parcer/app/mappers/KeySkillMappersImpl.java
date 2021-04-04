package parcer.app.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import parcer.app.dto.KeySkill;
import parcer.app.vo.KeySkillVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-04T15:35:14+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Ubuntu)"
)
@Component
public class KeySkillMappersImpl extends KeySkillMappers {

    @Override
    public KeySkill toDto(KeySkillVO vo) {
        if ( vo == null ) {
            return null;
        }

        KeySkill keySkill = new KeySkill();

        keySkill.setName( vo.getName() );
        keySkill.setId( vo.getId() );

        return keySkill;
    }

    @Override
    public KeySkillVO toVO(KeySkill dto) {
        if ( dto == null ) {
            return null;
        }

        KeySkillVO keySkillVO = new KeySkillVO();

        keySkillVO.setName( dto.getName() );
        keySkillVO.setId( dto.getId() );

        return keySkillVO;
    }
}
