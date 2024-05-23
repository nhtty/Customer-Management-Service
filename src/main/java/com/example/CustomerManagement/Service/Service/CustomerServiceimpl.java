package com.example.CustomerManagement.Service.Service;

import com.example.CustomerManagement.Service.Dto.CreateDto;
import com.example.CustomerManagement.Service.Dto.UpdateDto;
import com.example.CustomerManagement.Service.Model.Customer;
import com.example.CustomerManagement.Service.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceimpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public CreateDto addCustomer(Customer customer) {
        try {
            CreateDto createDto1 = new CreateDto(customer, "Customer Created ", "200");
            customerRepo.save(customer);
            return createDto1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            CreateDto createDto1 = new CreateDto(null, "Customer Not Created ", "200");
            return createDto1;
        }
    }

    @Override
    public UpdateDto updateCustomer(int id, Customer customerDetails) {
        try {
            Optional<Customer> optional = customerRepo.findById(id);
            if (optional.isPresent()) {
                Customer customer1 = optional.get();
                customer1.setFirstName(customerDetails.getFirstName());
                customer1.setLastName(customerDetails.getLastName());
                customer1.setEmail(customerDetails.getEmail());
                customer1.setPhone(customerDetails.getPhone());
                customer1.setAddress(customerDetails.getAddress());
                customer1.setCustomFields(customerDetails.getCustomFields());
                customerRepo.save(customer1);
                return new UpdateDto(customer1, "Customer info successfully updated", "202");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            UpdateDto updateDto1 = new UpdateDto(null, "Customer Not Updated ", "202");
            return updateDto1;
        }
        return null;
    }

    @Override
    public Customer getCustomerById(String customerid) {
        return customerRepo.findById(Integer.parseInt(customerid)).orElse(null);
    }
}
