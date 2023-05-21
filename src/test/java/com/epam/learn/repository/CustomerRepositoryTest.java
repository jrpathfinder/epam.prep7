package com.epam.learn.repository;

import com.epam.learn.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository repository;

    @Test
    void findByLastName() {
        Customer customer = new Customer("first name", "last name");
        List<Customer> expectedCustomers = new ArrayList<>();
        expectedCustomers.add(customer);
        repository.save(customer);
        List<Customer> customers = repository.findByLastName("last name");
        assertArrayEquals(expectedCustomers.toArray(), customers.toArray());
    }

    @Test
    void findById() {
        Customer customer = new Customer("first name", "last name");
        repository.save(customer);
        Customer customerById = repository.findById(1L);
        assertEquals("Jack", customerById.getFirstName());
    }
}