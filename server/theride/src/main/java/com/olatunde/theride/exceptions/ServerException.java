package com.olatunde.theride.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ServerException extends RuntimeException {

    public ServerException(String message) {
        super(message);
    }
}