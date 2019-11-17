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
@Table(name = "urllinks")
public class Urllinks implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "urllinks_id", nullable = false)
  private Integer urllinksId;

  @Column(name = "linkdescription")
  private String linkdescription;

  @Column(name = "linkname")
  private String linkname;

  @Column(name = "url")
  private String url;

  @Column(name = "categorylink_id")
  private Integer categorylinkId;

  
}