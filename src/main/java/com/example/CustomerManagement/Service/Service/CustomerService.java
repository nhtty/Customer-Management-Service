package com.example.CustomerManagement.Service.Service;

import com.example.CustomerManagement.Service.Dto.CreateDto;
import com.example.CustomerManagement.Service.Dto.UpdateDto;
import com.example.CustomerManagement.Service.Model.Customer;

public interface CustomerService {

    public CreateDto addCustomer(Customer customer);
    public UpdateDto updateCustomer(int id, Customer customer);
    Customer getCustomerById(String customerid);
}
