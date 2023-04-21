package com.olatunde.theride.entities;


import com.olatunde.theride.entities.enums.CarType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car extends BaseAuditableModel {

    private String name;
    private Timestamp year;
    private String make;
    private String model;
    private String licensePlateNumber;
    private CarType carType;
    private BigDecimal ratePerHour;

    @ManyToOne
    @JoinColumn(nullable = false, name="driver_id")
    private Driver driver;
}
