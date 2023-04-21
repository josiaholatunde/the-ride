package com.olatunde.theride.entities;

import com.olatunde.theride.entities.enums.DataType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Lob;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class KYCInformation extends BaseAuditableModel {

    private String friendlyLabel;
    private String description;
    private DataType dataType;
    private String supportedExtensions;
    private boolean requiresVerification;
    private Long priority;
    @Lob
    private String sampleValue;
    private String category;
}
