package com.pat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.pat.domain.Categorylink;

public interface CategorylinkRepository extends JpaRepository<Categorylink, Integer>, JpaSpecificationExecutor<Categorylink> {

}