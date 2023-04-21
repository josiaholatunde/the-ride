package com.olatunde.theride.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverRegistrationResponse {
    private String name;
    private String emailAddress;
    private String address;
    private String phoneNumber;
    private String licenseNumber;
}
