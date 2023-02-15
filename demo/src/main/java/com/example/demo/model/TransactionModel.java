package com.example.demo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "TRANSACTION")
public class TransactionModel {

  @Id
  @GeneratedValue
  private Long id;
  private float amount;
  private String city;
  
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "TIMESTAMP")
  private Date timestamp;
  
}