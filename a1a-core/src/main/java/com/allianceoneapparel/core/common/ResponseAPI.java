package com.allianceoneapparel.core.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseAPI<T> {
    private int code;
    private String message;
    @JsonProperty("data")
    private T data;
}
