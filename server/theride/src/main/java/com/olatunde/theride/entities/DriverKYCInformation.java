package com.olatunde.theride.entities;

import com.olatunde.theride.entities.enums.KYCVerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DriverKYCInformation extends BaseAuditableModel{

    @Lob
    private String data;
    private boolean isCompleted;
    private KYCVerificationStatus verificationStatus;
    private String rejectionReason;
    @ManyToOne
    @JoinColumn(nullable = false, name = "driver_id")
    private Driver driver;
}
