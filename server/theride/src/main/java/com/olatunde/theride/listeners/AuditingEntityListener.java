package com.olatunde.theride.listeners;


import com.olatunde.theride.entities.BaseAuditableModel;
import com.olatunde.theride.util.DateUtil;
import org.springframework.stereotype.Component;

//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;

@Component
public class AuditingEntityListener {

//    @PrePersist
//    public void beforeCreation(BaseAuditableModel baseAuditableModel) {
//        baseAuditableModel.setCreatedAt(DateUtil.getCurrentDate());
//        baseAuditableModel.setUpdatedAt(DateUtil.getCurrentDate());
//    }
//
//    @PreUpdate
//    public void beforeUpdate(BaseAuditableModel baseAuditableModel) {
//        baseAuditableModel.setUpdatedAt(DateUtil.getCurrentDate());
//    }
}