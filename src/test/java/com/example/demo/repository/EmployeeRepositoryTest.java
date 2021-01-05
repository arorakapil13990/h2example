package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testFindById(){
        Optional<Employee> employee = employeeRepository.findById(1);
        Assertions.assertEquals(1,employee.get().getId());
    }

    @Test
    void testFindByName(){
        Employee employee = employeeRepository.findByName("kapil");
        Assertions.assertEquals("kapil",employee.getName());
    }
}
