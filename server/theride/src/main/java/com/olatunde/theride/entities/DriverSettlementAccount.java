package com.olatunde.theride.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DriverSettlementAccount extends BaseAuditableModel {

    private String accountNumber;
    private String accountName;
    private String bankCode;
    private boolean pendingUpdate;

    @ManyToOne
    @JoinColumn(nullable = false, name = "driver_id")
    private Driver driver;
}
