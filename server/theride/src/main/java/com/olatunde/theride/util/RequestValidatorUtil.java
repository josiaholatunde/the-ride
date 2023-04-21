package com.olatunde.theride.util;

import com.olatunde.theride.exceptions.UnprocessibleRequestException;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.HashMap;
import java.util.Map;

@Service
public class RequestValidatorUtil {

    public static void validate(BindingResult fields) {
        Map<String, String> fieldErrors = new HashMap<>();
        for (ObjectError error: fields.getAllErrors()) {
           String fieldError =  error.getDefaultMessage();
           String field =  ((FieldError)error).getField();
           if (Strings.isBlank(fieldError)) continue;
           fieldErrors.put(field, fieldError);
        }
        if (!fieldErrors.isEmpty()) {
            String message = "One or more validation errors occurred.";
            throw new UnprocessibleRequestException(message, fieldErrors);
        }
    }
}