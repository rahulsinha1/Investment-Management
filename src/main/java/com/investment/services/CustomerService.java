package com.investment.services;

import org.springframework.security.core.userdetails.User;
import com.investment.model.Customer;
import java.util.Optional;

public interface CustomerService {
	
    String login(String username, String password);
    Optional<User> findByToken(String token);

	Customer findById(int id);
}