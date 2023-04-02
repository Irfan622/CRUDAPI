package com.usr.repository;

import org.springframework.data.repository.CrudRepository;

import com.usr.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
	

}