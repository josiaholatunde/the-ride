package com.olatunde.theride.advice;


import com.olatunde.theride.annotations.IgnoreWrapResponse;
import com.olatunde.theride.annotations.WrapResponse;
import com.olatunde.theride.util.ResponseUtilService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice(annotations = WrapResponse.class)
@RequiredArgsConstructor
public class WrapResponseAdvice implements ResponseBodyAdvice<Object> {
    private final ResponseUtilService responseUtilService;

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return methodParameter.getMethod() == null || (methodParameter.getMethod().getDeclaredAnnotation(IgnoreWrapResponse.class) == null);    }

    @Nullable
    @Override
    public Object beforeBodyWrite(@Nullable Object data, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        return responseUtilService.buildSuccessResponse(data);
    }
}