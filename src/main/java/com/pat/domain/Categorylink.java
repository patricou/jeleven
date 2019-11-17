package com.pat.domain;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "categorylink")
public class Categorylink implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "categorylink_id", nullable = false)
  private Integer categorylinkId;

  @Column(name = "categorydescription")
  private String categorydescription;

  @Column(name = "categoryname")
  private String categoryname;

  
}