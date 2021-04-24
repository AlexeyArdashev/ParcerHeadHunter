package parcer.app.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Salary {
    /**
     * Нижняя граница вилки оклада.
     */
    @Nullable
    @JsonProperty("from")
    Integer from;
    /**
     * Верхняя граница вилки оклада.
     */
    @Nullable
    @JsonProperty("to")
    Integer to;
    /**
     * Признак того что оклад указан до вычета налогов..
     */
    @Nullable
    @JsonProperty("gross")
    Boolean gross;
}
