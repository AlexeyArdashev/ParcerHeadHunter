package parcer.app.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import parcer.app.dto.Employer;
import parcer.app.vo.EmployerVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-04T15:35:13+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Ubuntu)"
)
@Component
public class EmployerMappersImpl extends EmployerMappers {

    @Override
    public Employer toDto(EmployerVO vo) {
        if ( vo == null ) {
            return null;
        }

        Employer employer = new Employer();

        employer.setName( vo.getName() );
        employer.setId( vo.getId() );

        return employer;
    }

    @Override
    public EmployerVO toVO(Employer dto) {
        if ( dto == null ) {
            return null;
        }

        EmployerVO employerVO = new EmployerVO();

        employerVO.setName( dto.getName() );
        employerVO.setId( dto.getId() );

        return employerVO;
    }
}
