package parcer.app.vo;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
@Table(name = "area_vacancy")

public class AreaVO {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "url")
    private String url;
    @Column(name = "name_region")
    private String name;
}