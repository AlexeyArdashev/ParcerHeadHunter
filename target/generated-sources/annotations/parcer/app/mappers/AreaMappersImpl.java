package parcer.app.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import parcer.app.dto.Area;
import parcer.app.vo.AreaVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-04T15:35:14+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Ubuntu)"
)
@Component
public class AreaMappersImpl extends AreaMappers {

    @Override
    public Area toDto(AreaVO vo) {
        if ( vo == null ) {
            return null;
        }

        Area area = new Area();

        area.setUrl( vo.getUrl() );
        area.setId( vo.getId() );
        area.setName( vo.getName() );

        return area;
    }

    @Override
    public AreaVO toVO(Area dto) {
        if ( dto == null ) {
            return null;
        }

        AreaVO areaVO = new AreaVO();

        areaVO.setId( dto.getId() );
        areaVO.setUrl( dto.getUrl() );
        areaVO.setName( dto.getName() );

        return areaVO;
    }
}
