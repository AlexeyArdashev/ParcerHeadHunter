package parcer.app.vo;
import parcer.app.vo.VacancyVO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name = "area_vacancy")

public class AreaVO {
    @Id
    @Column(name = "id",  nullable = false)
    private String id;
    @Column(name = "url")
    private String url;
    @Column(name = "name_region")
    private String name;

    @OneToMany (mappedBy="area", fetch= FetchType.LAZY)
    private Collection<VacancyVO> vacansies;
}
