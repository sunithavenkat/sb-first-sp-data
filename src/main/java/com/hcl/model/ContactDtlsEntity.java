package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACT_DTLS")
public class ContactDtlsEntity {
   @Id
   @Column(name="C_ID")
   private String id;
   @Column(name="CNAME")
   private String contactName;
   @Column(name="CNUMBER")
   private Long contactNumber;
}
