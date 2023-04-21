package com.olatunde.theride.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {

    private boolean requestSuccessful;

    private String message;

    private Object data;

    private Object errors;
}