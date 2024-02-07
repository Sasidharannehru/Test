package com.sasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sasi.model.Customer;

@Repository
public interface customerRepo extends JpaRepository<Customer, Integer> {

}
