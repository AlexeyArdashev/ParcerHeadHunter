package parcer.app.vo;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
@Table(name = "key_skils")
public class KeySkillVO {
    @Column(name = "skill")
    private String name;
    @Id
    @Column(name = "id")
    private UUID id;
}
