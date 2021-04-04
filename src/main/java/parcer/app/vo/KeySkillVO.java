package parcer.app.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
@Getter @Setter
@Table(name = "key_skils")
public class KeySkillVO {

    public KeySkillVO (UUID id) {
        this.id = id;
    }
    public KeySkillVO() {}
    public void setSkill (String nameSkill){
        this.name = nameSkill;
    }
    @Column(name = "skill")
    private String name;
    @Id
    @Column(name = "id")
    private UUID id;
}
