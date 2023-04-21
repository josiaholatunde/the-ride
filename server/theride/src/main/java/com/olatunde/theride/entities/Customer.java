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
public class Customer extends BaseAuditableModel {

    private String name;
    private String emailAddress;
    private String address;
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;
}
