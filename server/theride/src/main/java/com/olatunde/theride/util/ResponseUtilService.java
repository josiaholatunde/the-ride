package com.olatunde.theride.util;

import com.olatunde.theride.dtos.response.BaseResponse;
import org.springframework.stereotype.Service;

import static com.olatunde.theride.util.Constant.SUCCESS_RESPONSE_MESSAGE;

@Service
public class ResponseUtilService {

    public BaseResponse buildErrorResponse(String message) {
        return BaseResponse.builder()
                .requestSuccessful(false)
                .message(message)
                .build();
    }

    public BaseResponse buildErrorResponseWithDetails(String message, Object errorDetails) {
        return BaseResponse.builder()
                .requestSuccessful(false)
                .message(message)
                .errors(errorDetails)
                .build();
    }

    public Object buildSuccessResponse(Object data) {
        return BaseResponse
                .builder()
                .requestSuccessful(true)
                .message(SUCCESS_RESPONSE_MESSAGE)
                .data(data)
                .build();
    }
}