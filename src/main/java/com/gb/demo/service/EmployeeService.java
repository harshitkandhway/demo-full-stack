package com.gb.demo.service;

import com.gb.demo.domain.Employee;
import com.gb.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repo;
    public Employee createEmp(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAll() {
        return (List<Employee>)repo.findAll();
    }
}
