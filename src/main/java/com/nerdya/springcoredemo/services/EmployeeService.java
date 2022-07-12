package com.nerdya.springcoredemo.services;

import com.nerdya.springcoredemo.entities.Employee;
import com.nerdya.springcoredemo.repositories.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cuongnk
 * @created_date 12/07/2022
 */
@Service
public class EmployeeService {

  private final EmployeeRepository employeeRepository;

  @Autowired
  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public List<Employee> getEmployees() {
    return employeeRepository.findAll();
  }

}
