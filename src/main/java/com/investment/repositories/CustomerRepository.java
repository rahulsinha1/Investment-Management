package com.investment.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.investment.model.Customer;

@Repository
public interface CustomerRepository
	extends JpaRepository<Customer, Integer> {

	@Query("select c from customer c where c.userName = ?1")
	public Customer findByUserName(String username);
	
	@Query("SELECT u FROM customer u where u.userName = ?1 AND u.userPassword = ?2 ")
    public Optional<Customer> login(String username,String password);
	@Query("SELECT u FROM customer u where u.token= ?1 ")
    public Optional<Customer> findByToken(String token);
    @Query("SELECT u FROM customer u where u.id = ?1")
	public Optional<Customer> findById(int id);
}