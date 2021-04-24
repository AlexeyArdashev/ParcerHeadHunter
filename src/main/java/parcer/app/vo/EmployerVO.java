package parcer.app.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name = "employer_company")
public class EmployerVO {
    @Column(name = "name_company")
    private String name;
    @Id
    @Column(name = "id",  nullable = false)
    private String id;

    @OneToMany(mappedBy="employer", fetch= FetchType.LAZY)
    private Collection<VacancyVO> vacansies;
}
