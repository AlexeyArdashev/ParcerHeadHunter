package parcer.app.vo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "full_description_vacancy")
public class VacancyVO {

    @Id
  //  @Column(name = "id", nullable = false)
   // private UUID uniqueId;
    @Column(name = "id_vacancy", nullable = false)
    private String id;

    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "area_vacancy", nullable = true)
    private AreaVO area;

    @Column(name = "description", length = 8000)
    private String description;

    /*
    @ManyToMany
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinTable (name="vacancy_skill",
            joinColumns=@JoinColumn (name="vacancy_id"),
            inverseJoinColumns=@JoinColumn(name="skill_id"))
    private List<KeySkillVO> key_skills;

    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "experiens")
    private ExperiensVO experiens;
    */

    @ManyToMany (fetch = FetchType.EAGER)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinTable (name="vacancy_specialization",
            joinColumns=@JoinColumn (name="vacancy_id"),
            inverseJoinColumns=@JoinColumn(name="specialization_id"))
    private List<SpecializationVO> specializations;

    @Nullable
    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "employer_company", nullable = true)
    private EmployerVO employer;

    @Embedded
    @Nullable
    @Column(name = "salary")
    private SalaryVO salary;

    @Column(name = "created_at")
    private String created_at;
    @Column(name = "published_at")
    private String published_at;

    @Column(name = "name_vacansy")
    private String name;

    @Column(name = "actual")
    private Boolean archived;
}
