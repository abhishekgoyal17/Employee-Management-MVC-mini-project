package com.abhishekgoyal.springMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishekgoyal.springMVC.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}