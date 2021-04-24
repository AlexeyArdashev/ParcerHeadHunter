package parcer.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Area {
    /**
     * Url получения информации о регионе
     */
    @JsonProperty("url")
    private String url;
    /**
     * Идентификатор региона
     */
    @JsonProperty("id")
    private String id;
    /**
     * Название региона
     */
    @JsonProperty("name")
    private String name;

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Description Area:\n");
        str.append("name: " + name + "\n");
        str.append("id: " + id + "\n");
        return str.toString();
    }
}
