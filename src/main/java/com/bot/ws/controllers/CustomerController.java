package com.bot.ws.controllers;

import com.bot.ws.model.Customer;
import com.bot.ws.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


public class CustomerController {

/*
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    public ResponseEntity save(@RequestBody Customer customer){
        Customer savedCustomer = customerRepository.save(customer);

        return ResponseEntity.ok(savedCustomer);
    }


    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable(name = "id") long id){
        Customer customer = customerRepository.findOne(id);

       if (customer != null) {
        return ResponseEntity.ok(customer);

       }

       return ResponseEntity.notFound().build();
    }

*/


}
