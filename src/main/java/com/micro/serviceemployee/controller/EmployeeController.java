package com.micro.serviceemployee.controller;

import com.micro.serviceemployee.model.Employee;
import com.micro.serviceemployee.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("add")
    public Employee addDepartment(@RequestBody Employee department) {
        LOGGER.info("START addDepartment()");
        return employeeRepository.addDepartment(department);
    }

    @GetMapping("{id}")
    public Employee findById(@PathVariable("id") Long id) {
        LOGGER.info("START findById() for id : {}", id);
        return employeeRepository.findById(id);
    }

    @GetMapping("getAll")
    public List<Employee> getAll() {
        LOGGER.info("START getAll()");
        return employeeRepository.getAll();
    }
    @GetMapping("findByDepartmentId/{id}")
    public List<Employee> findByDepartmentId(@PathVariable("id") Long deptId) {
        LOGGER.info("START findByDepartmentId()");
        return employeeRepository.findByDepartmentId(deptId);
    }

}
