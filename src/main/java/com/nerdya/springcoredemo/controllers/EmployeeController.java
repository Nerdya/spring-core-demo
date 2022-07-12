package com.nerdya.springcoredemo.controllers;

import com.nerdya.springcoredemo.entities.Employee;
import com.nerdya.springcoredemo.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuongnk
 * @created_date 12/07/2022
 */
@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeeController {

  private final EmployeeService employeeService;

  @Autowired
  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @GetMapping
  public List<Employee> getEmployees() {
    return employeeService.getEmployees();
  }

  // Other CRUD endpoints handlers
}