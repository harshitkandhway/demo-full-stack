package com.gb.demo.resource;

import com.gb.demo.domain.Employee;
import com.gb.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/employee")
public class EmployeeResource {

    @Autowired
    public EmployeeService empService;

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @PostMapping
    public ResponseEntity<Employee> createEmp(@RequestBody Employee emp) {
        Employee saved = empService.createEmp(emp);
        return new ResponseEntity<Employee>(saved, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAll(){
        List<Employee> all = empService.getAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
}
