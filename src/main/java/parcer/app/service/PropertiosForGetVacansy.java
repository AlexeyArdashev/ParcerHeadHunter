package parcer.app.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertiosForGetVacansy {
    @JsonProperty("id")
    private String idVacansy;

    String getIdVacansy() {
        return idVacansy;
    }
}
