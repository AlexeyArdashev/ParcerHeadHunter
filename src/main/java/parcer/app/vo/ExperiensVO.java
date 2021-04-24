package parcer.app.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name = "experiens_vacansy")
public class ExperiensVO {

    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "id",  nullable = false)
    private String id;

  /*  @OneToMany(mappedBy="experiens", fetch= FetchType.LAZY)
    private Collection<VacancyVO> vacansies;
    */
}
