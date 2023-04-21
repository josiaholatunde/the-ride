package com.olatunde.theride.services;

import com.olatunde.theride.dtos.request.DriverRegistrationRequestDTO;
import com.olatunde.theride.dtos.response.DriverRegistrationResponse;

public interface AccountRegistrationService {


    DriverRegistrationResponse registerDriver(DriverRegistrationRequestDTO driverRegistrationRequestDTO);
}
