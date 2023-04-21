package com.olatunde.theride.controllers;

import com.olatunde.theride.dtos.request.DriverRegistrationRequestDTO;
import com.olatunde.theride.dtos.response.DriverRegistrationResponse;
import com.olatunde.theride.services.AccountRegistrationService;
import com.olatunde.theride.util.RequestValidatorUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.olatunde.theride.util.Constant.API_V1;

@RestController
@RequestMapping(value = API_V1 + "/auth", produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
public class AuthController {

    private final AccountRegistrationService accountRegistrationService;
    private final RequestValidatorUtil requestValidatorUtil;

    @PostMapping("/register-driver")
    public DriverRegistrationResponse registerDriver(@Validated @RequestBody DriverRegistrationRequestDTO driverRegistrationRequestDTO, BindingResult fields) {
        requestValidatorUtil.validate(fields);
        return accountRegistrationService.registerDriver(driverRegistrationRequestDTO);
    }

}
