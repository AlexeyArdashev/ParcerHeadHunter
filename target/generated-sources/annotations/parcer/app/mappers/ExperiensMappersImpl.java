package parcer.app.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import parcer.app.dto.Experiens;
import parcer.app.vo.ExperiensVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-04T15:35:13+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Ubuntu)"
)
@Component
public class ExperiensMappersImpl extends ExperiensMappers {

    @Override
    public Experiens toDto(ExperiensVO vo) {
        if ( vo == null ) {
            return null;
        }

        Experiens experiens = new Experiens();

        experiens.setId( vo.getId() );
        experiens.setName( vo.getName() );

        return experiens;
    }

    @Override
    public ExperiensVO toVO(Experiens dto) {
        if ( dto == null ) {
            return null;
        }

        ExperiensVO experiensVO = new ExperiensVO();

        experiensVO.setName( dto.getName() );
        experiensVO.setId( dto.getId() );

        return experiensVO;
    }
}
