package parcer.app.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 *Короткое представление работодателя
 */

@Getter @Setter
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
