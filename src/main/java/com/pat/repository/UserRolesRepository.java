package com.pat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.pat.domain.UserRoles;

public interface UserRolesRepository extends JpaRepository<UserRoles, Integer>, JpaSpecificationExecutor<UserRoles> {

}