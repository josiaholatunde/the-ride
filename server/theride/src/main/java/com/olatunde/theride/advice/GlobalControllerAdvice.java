package com.olatunde.theride.advice;

import com.olatunde.theride.dtos.response.BaseResponse;
import com.olatunde.theride.exceptions.BadRequestException;
import com.olatunde.theride.exceptions.ResourceNotFoundException;
import com.olatunde.theride.exceptions.UnauthorizedException;
import com.olatunde.theride.exceptions.UnprocessibleRequestException;
import com.olatunde.theride.util.ResponseUtilService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
@RequiredArgsConstructor
public class GlobalControllerAdvice {

    private final ResponseUtilService responseUtilService;

    @ExceptionHandler(AuthenticationException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public BaseResponse handleAuthenticationException(AuthenticationException ex, HttpServletRequest request) {
        log.error("An error occurred while authenticating user {}", ex.getMessage());
        return responseUtilService.buildErrorResponse(ex.getMessage());
    }

    @ExceptionHandler(UnprocessibleRequestException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public BaseResponse handleUnprocessibleException(UnprocessibleRequestException ex, HttpServletRequest request) {
        return responseUtilService.buildErrorResponseWithDetails(ex.getMessage(), ex.getFieldErrors());
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BaseResponse handleBadRequestException(BadRequestException ex, HttpServletRequest request) {
        return responseUtilService.buildErrorResponse(ex.getMessage());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public BaseResponse handleResourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request) {
        return responseUtilService.buildErrorResponse(ex.getMessage());
    }

    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public BaseResponse handleUnauthorizedException(UnauthorizedException ex, HttpServletRequest request) {
        log.error("An error occurred while authenticating user credentials {}", ex.getMessage());
        return responseUtilService.buildErrorResponse(ex.getMessage());
    }

}