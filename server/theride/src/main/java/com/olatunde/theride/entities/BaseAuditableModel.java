package com.olatunde.theride.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.olatunde.theride.entities.enums.EntityStatus;
import com.olatunde.theride.listeners.AuditingEntityListener;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@MappedSuperclass
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Data
@EntityListeners(AuditingEntityListener.class)
public class BaseAuditableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;

    @Enumerated(EnumType.STRING)
    private EntityStatus status;
}