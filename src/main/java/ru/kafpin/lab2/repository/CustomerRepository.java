package ru.kafpin.lab2.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kafpin.lab2.entity.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findAll();
}
