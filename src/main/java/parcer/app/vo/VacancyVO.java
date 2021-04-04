package parcer.app.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "full_description_vacancy")
public class VacancyVO {

    @Id
    @Column(name = "id", nullable = false)
    private UUID uniqueId;
    @Column(name = "id_ vacancy")
    private String id;

    @ManyToOne
    @JoinColumn(name = "area_vacancy", nullable = true)
    private AreaVO area;
    /**
     *Описание вакансии
     */
    @Column(name = "description")
    private String description;

    @OneToMany
    @JoinColumn(name = "key_skils")
    private List<KeySkillVO> key_skills;

    @Column(name = "experiens")
    private ExperiensVO experiens;
    @OneToMany
    @JoinColumn(name = "specialization_vacancy")
    private  List <SpecializationVO> specializations;
    @Nullable
    @ManyToOne
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
