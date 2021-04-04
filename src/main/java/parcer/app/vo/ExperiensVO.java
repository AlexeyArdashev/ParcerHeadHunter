package parcer.app.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
@Getter @Setter
@Table(name = "experiens_vacansy")
public class ExperiensVO {

    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "id")
    private String id;
}
