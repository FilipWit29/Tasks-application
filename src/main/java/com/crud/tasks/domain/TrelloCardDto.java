package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class TrelloCardDto {
    @JsonProperty("name")
    private String name;
    @JsonProperty("desc")
    private String description;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("idList")
    private String idList;

    @Override
    public String toString() {
        return "TrelloCardDto{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", pos='" + pos + '\'' +
                ", idList='" + idList + '\'' +
                '}';
    }
}
