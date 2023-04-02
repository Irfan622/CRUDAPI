package com.usr.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.usr.entity.Employee;
import com.usr.repository.EmployeeRepository;

@Service
public class EmployeeService {
		@Autowired
		EmployeeRepository employeeRepository;
		 
	public List<Employee> getAll(){
			return(List<Employee>) employeeRepository.findAll();		
     }
	public String addEmployee(Employee emp) {
		String response;
		
		if(employeeRepository.save(emp)!=null)
		{
			response ="successfully Added";
		}
		else 
			response ="error";
		return response;
	}
	public String updateEmployee(Employee emp) {
		String response;
		
		if(employeeRepository.save(emp)!=null)
		{
			response ="successfully updated";
		}
		else 
			response ="error";
		
		return response;
	}
	public String deleteEmployee(int id) {
		String response;
		try
		{
			employeeRepository.deleteById(id);
			response ="successfully deleted";
		}
		catch(IllegalArgumentException e) {
			response ="error"; 
		}
		return response;
	}
	
  
}