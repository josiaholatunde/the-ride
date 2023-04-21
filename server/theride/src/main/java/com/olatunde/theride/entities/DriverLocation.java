package com.olatunde.theride.entities;

import com.vividsolutions.jts.geom.Point;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DriverLocation extends BaseAuditableModel{

    private Point location;

    @OneToOne
    @JoinColumn(nullable = false, name = "car_id")
    private Car currentCar;
    @OneToOne
    @JoinColumn(nullable = false, name = "driver_id")
    private Driver driver;
}
