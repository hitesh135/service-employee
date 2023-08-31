package com.micro.serviceemployee.repository;

import com.micro.serviceemployee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public Employee addDepartment(Employee department) {
        employees.add(department);
        return department;
    }

    public Employee findById(Long id) {
        return employees.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst().get();
    }

    public List<Employee> getAll() {
        return employees;
    }
    public List<Employee> findByDepartmentId(Long deptId) {
        return employees.stream().filter(p -> p.getDepartmentId().equals(deptId)).collect(Collectors.toList());
    }
}
