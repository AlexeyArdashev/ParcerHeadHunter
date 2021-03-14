package parcer.app.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *Короткое представление работодателя
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class Employer {
    /**
     * Название компании.
     */
    @JsonProperty("name")
    private String name;
    /**
     * Идентификатор компании.
     */
    @JsonProperty("id")
    private String id;
}
