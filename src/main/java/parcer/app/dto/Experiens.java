package parcer.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Требуемый опыт работы
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Experiens {
    /**
     * Идентификатор требуемого опыта работы
     */
    @JsonProperty("id")
    private String id;
    /**
     * Название требуемого опыта работы
     */
    @JsonProperty("name")
    private String name;

}
