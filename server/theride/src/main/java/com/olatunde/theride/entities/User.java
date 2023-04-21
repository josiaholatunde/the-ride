package com.olatunde.theride.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends BaseAuditableModel {

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;
}