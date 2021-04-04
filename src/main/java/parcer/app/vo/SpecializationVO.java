package parcer.app.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
@Getter @Setter
@Table(name = "specialization_vacancy")
public class SpecializationVO {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "profarea_id")
    private String profarea_id;
    @Column(name = "profarea_name")
    private String profarea_name;
    @Column(name = "name_specialization")
    private String name;
}
