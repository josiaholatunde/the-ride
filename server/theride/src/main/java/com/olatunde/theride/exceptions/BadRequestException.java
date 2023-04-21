package com.olatunde.theride.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class BadRequestException extends RuntimeException {

    public  BadRequestException(String message) {
        super(message);
    }
}