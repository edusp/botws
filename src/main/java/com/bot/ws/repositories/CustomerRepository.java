package com.bot.ws.repositories;

import com.bot.ws.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @RestResource(rel = "by-id", path = "by-id")
    Page<Customer> findById(@Param("q") Long id, Pageable page);


}
