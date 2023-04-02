package com.usr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usr.entity.Employee;
import com.usr.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	@PostMapping("/")
	public String addEmployee(@RequestBody Employee emp) {
		return employeeService.addEmployee(emp);
		
	}
	@PutMapping("/")
	public String updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
		
	}
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
		
	}

}