package parcer.app.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor

@JsonIgnoreProperties(ignoreUnknown = true)
public class PageVacancies {
    @JsonProperty("found")
    private int found;
    @JsonProperty("per_page")
    private int per_page;
    @JsonProperty("pages")
    private int pages;
    @JsonProperty("page")
    private int page;
    @JsonProperty("items")
    ArrayList<PropertiosForGetVacansy> items;
    public ArrayList<PropertiosForGetVacansy> getItems(){
        return items;
    }
}

