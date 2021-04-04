package parcer.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeySkill {

    public String getName() { return name; }
    @JsonProperty("name")
    private String name;
    private UUID id;
}
