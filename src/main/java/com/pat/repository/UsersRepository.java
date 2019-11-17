package com.pat.repository;

import com.pat.domain.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.pat.domain.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface UsersRepository extends PagingAndSortingRepository<Users,String> {
    List<Users> findAll();
}