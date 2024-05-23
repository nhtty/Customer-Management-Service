package com.example.CustomerManagement.Service.Controller;

import com.example.CustomerManagement.Service.Model.Customer;
import com.example.CustomerManagement.Service.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerControllers {

    @Autowired
    CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<?> creatCustomers(@RequestBody Customer customer) {

        return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateCustomer(@PathVariable int id, @RequestBody Customer customer) {

        return new ResponseEntity<>(customerService.updateCustomer(id, customer), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get/{customerid}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("customerid") String customerid) {
        Customer customer = customerService.getCustomerById(customerid);
        if (customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();

        }
    }
}