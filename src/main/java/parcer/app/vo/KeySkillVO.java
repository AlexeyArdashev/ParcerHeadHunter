package parcer.app.vo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "key_skils")
public class KeySkillVO {

    public KeySkillVO(UUID id, String nameSkil) {
        this.id = id;
        this.name = nameSkil;
    }
    public KeySkillVO() {}
    @Column(name = "skill")
    private String name;
    @Id
    @Column(name = "id",  nullable = false)
    private UUID id;

   /* @ManyToMany
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinTable (name="vacancy_skill",
            joinColumns=@JoinColumn (name="skill_id"),
            inverseJoinColumns=@JoinColumn(name="vacancy_id"))
    private List<VacancyVO> vacancies;
    */
}
