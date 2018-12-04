package com.example.employeetracker.controllers;

import com.example.employeetracker.models.Employee;
import com.example.employeetracker.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping(value = "/allemployees")
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    @GetMapping(value = "{id}")
    public Optional<Employee> getEmployeeByID(@PathVariable Long id){
        return employeeRepo.findById(id);
    }
}
