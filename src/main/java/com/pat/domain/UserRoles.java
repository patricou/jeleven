package com.pat.domain;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_roles")
@Data
@Entity
public class UserRoles implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_role_id", insertable = false, nullable = false)
  private Integer userRoleId;

  @Column(name = "username", nullable = false)
  private String username;

  @Column(name = "role", nullable = false)
  private String role;

  
}