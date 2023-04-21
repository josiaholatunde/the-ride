package com.olatunde.theride.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class UnprocessibleRequestException extends RuntimeException {

    private Map<String, String> fieldErrors = new HashMap<>();
    public UnprocessibleRequestException(String message, Map<String, String> fieldErrors) {
        super(message);
        this.fieldErrors = fieldErrors;
    }
}
