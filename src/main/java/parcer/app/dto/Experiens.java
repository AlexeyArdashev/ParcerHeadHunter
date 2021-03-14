package parcer.app.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Требуемый опыт работы
 */
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
