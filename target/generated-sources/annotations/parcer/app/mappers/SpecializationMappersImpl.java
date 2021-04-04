package parcer.app.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import parcer.app.dto.Specialization;
import parcer.app.vo.SpecializationVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-04T15:35:14+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Ubuntu)"
)
@Component
public class SpecializationMappersImpl extends SpecializationMappers {

    @Override
    public Specialization toDto(SpecializationVO vo) {
        if ( vo == null ) {
            return null;
        }

        Specialization specialization = new Specialization();

        specialization.setProfarea_id( vo.getProfarea_id() );
        specialization.setProfarea_name( vo.getProfarea_name() );
        specialization.setId( vo.getId() );
        specialization.setName( vo.getName() );

        return specialization;
    }

    @Override
    public SpecializationVO toVO(Specialization dto) {
        if ( dto == null ) {
            return null;
        }

        SpecializationVO specializationVO = new SpecializationVO();

        specializationVO.setId( dto.getId() );
        specializationVO.setProfarea_id( dto.getProfarea_id() );
        specializationVO.setProfarea_name( dto.getProfarea_name() );
        specializationVO.setName( dto.getName() );

        return specializationVO;
    }
}
