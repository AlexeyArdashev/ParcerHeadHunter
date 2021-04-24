package parcer.app.vo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "specialization_vacancy")
public class SpecializationVO {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "profarea_id")
    private String profarea_id;
    @Column(name = "profarea_name" )
    private String profarea_name;
    @Column(name = "name_specialization")
    private String name;

    @ManyToMany (fetch = FetchType.EAGER)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinTable (name="vacancy_specialization",
            joinColumns=@JoinColumn (name="specialization_id"),
            inverseJoinColumns=@JoinColumn(name="vacancy_id"))
    private List<VacancyVO> vacancies;
}
