package com.pat.domain;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "users")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(insertable = false, name = "username", nullable = false)
  private String username;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "enabled", nullable = false)
  private Integer enabled = 1;

  
}