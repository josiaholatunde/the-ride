package com.olatunde.theride.services.impl;

import com.olatunde.theride.dtos.request.DriverRegistrationRequestDTO;
import com.olatunde.theride.dtos.response.DriverRegistrationResponse;
import com.olatunde.theride.services.AccountRegistrationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class AccountRegistrationServiceImpl implements AccountRegistrationService {


    @Override
    public DriverRegistrationResponse registerDriver(DriverRegistrationRequestDTO driverRegistrationRequestDTO) {
        return null;
    }
}
