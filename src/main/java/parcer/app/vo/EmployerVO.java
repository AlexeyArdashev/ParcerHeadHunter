package parcer.app.vo;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
@Table(name = "employer_company")
public class EmployerVO {
    @Column(name = "name_company")
    private String name;
    @Id
    @Column(name = "id")
    private String id;
}
