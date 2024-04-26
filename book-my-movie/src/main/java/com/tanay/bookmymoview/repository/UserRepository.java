package com.tanay.bookmymoview.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tanay.bookmymoview.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByMobile(String mobile);

	User findByName(String name);
}