package com.pat.repository;

import com.pat.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UsersRepository extends PagingAndSortingRepository<User,String> {
    List<User> findAll();

    User findUserByUsername(String UserName);
}