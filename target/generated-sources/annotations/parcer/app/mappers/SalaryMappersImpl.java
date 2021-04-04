package parcer.app.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import parcer.app.dto.Salary;
import parcer.app.vo.SalaryVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-04T15:35:13+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Ubuntu)"
)
@Component
public class SalaryMappersImpl extends SalaryMappers {

    @Override
    public Salary toDto(SalaryVO vo) {
        if ( vo == null ) {
            return null;
        }

        Salary salary = new Salary();

        salary.setFrom( vo.getFrom() );
        salary.setTo( vo.getTo() );
        salary.setGross( vo.getGross() );

        return salary;
    }

    @Override
    public SalaryVO toVO(Salary dto) {
        if ( dto == null ) {
            return null;
        }

        SalaryVO salaryVO = new SalaryVO();

        salaryVO.setFrom( dto.getFrom() );
        salaryVO.setTo( dto.getTo() );
        salaryVO.setGross( dto.getGross() );

        return salaryVO;
    }
}
