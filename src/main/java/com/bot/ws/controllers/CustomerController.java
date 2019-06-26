package com.bot.ws.controllers;

import com.bot.ws.model.Customer;
import com.bot.ws.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "customers")
public class CustomerController {


    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    public ResponseEntity save(@RequestBody Customer customer){

        Customer savedCustomer = customerRepository.save(customer);

        return ResponseEntity.ok(savedCustomer);
    }
}
