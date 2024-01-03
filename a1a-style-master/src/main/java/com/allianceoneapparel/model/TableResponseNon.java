package com.allianceoneapparel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class TableResponseNon {
    private List<String> headers;
    @JsonProperty("content")
    private Object content;
}
