package com.olatunde.theride.entities;


import com.olatunde.theride.entities.enums.KYCVerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "drivers")
public class Driver extends BaseAuditableModel {

    private String name;
    private String emailAddress;
    private String address;
    private String phoneNumber;
    private String licenseNumber;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private KYCVerificationStatus verificationStatus = KYCVerificationStatus.PENDING;

    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

}
