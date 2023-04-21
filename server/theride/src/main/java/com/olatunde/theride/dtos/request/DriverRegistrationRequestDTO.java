package com.olatunde.theride.dtos.request;

import com.olatunde.theride.entities.enums.KYCVerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverRegistrationRequestDTO {

    private String name;
    private String emailAddress;
    private String address;
    private String phoneNumber;
    private String licenseNumber;
    private String password;
}
