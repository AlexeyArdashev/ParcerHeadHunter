package parcer.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Specialization {
    /**
     * Идентификатор специализации
     */
    @JsonProperty("profarea_id")
    private String profarea_id;
    /**
     * Название специализации
     */
    @JsonProperty("profarea_name")
    private String profarea_name;
    /**
     * Идентификатор профессиональной области, в которую входит специализация
     */
    @JsonProperty("id")
    private String id;
    /**
     * Название профессиональной области, в которую входит специализация
     */
    @JsonProperty("name")
    private String name;
}
