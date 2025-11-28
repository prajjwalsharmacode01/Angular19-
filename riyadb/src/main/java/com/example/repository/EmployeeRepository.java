package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	 
    Employee findByFirstName(String name);
 
}