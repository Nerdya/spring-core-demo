package com.nerdya.springcoredemo.repositories;

import com.nerdya.springcoredemo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author cuongnk
 * @created_date 12/07/2022
 */
@Repository
public interface EmployeeRepository
    extends JpaRepository<Employee, Long> {

}
