package parcer.app.vo;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
@Table(name = "experiens_vacansy")
public class ExperiensVO {

    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "id")
    private String id;
}
