package com.investment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.investment.model.User;


public interface UserRepository
	extends JpaRepository<User, Integer> {

	@Query("select u from user u where user_name = ?1")
	public User findByUserName(String username);
}