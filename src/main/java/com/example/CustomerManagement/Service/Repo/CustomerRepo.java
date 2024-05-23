package com.example.CustomerManagement.Service.Repo;

import com.example.CustomerManagement.Service.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
