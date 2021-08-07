package com.orenda.xpert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.orenda.xpert.entity.Employee;

import com.orenda.xpert.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	
	@Autowired
	  EmployeeService empService;
	
	@GetMapping("/get")
	  public List<Employee> getAllEmployees(){
	    
		System.out.println("hid");
		return empService.getAllEmployees();
		
	    
	  }
	
	@GetMapping("/{id}")
	  public Employee getEmployeeById(@PathVariable int id) {
	    return empService.getEmployeeById(id);
	  }
	
	@PostMapping("/save")
	//@ResponseStatus(HttpStatus.CREATED)
	  public @ResponseBody Employee addEmployee(@RequestBody Employee emp) {
	    return empService.addEmployee(emp);
}


	@GetMapping("/lastname/{lastName}")
	  public List<Employee> getEmployeeByLastName(@PathVariable String lastName) {
	    return empService.getEmployeeByLastName(lastName);
	  }
	
	
	@GetMapping("/firstname/{firstName}")
	  public List<Employee> getEmployeeFirstName(@PathVariable String firstName) {
	    return empService.getEmployeeFirstName(firstName);
	  }
	

	@GetMapping("/dept/{dept}")
public List<Employee> getEmployeeByDept(@PathVariable String dept){
	
	return empService.getEmployeeByDept(dept);
	
}

	@DeleteMapping("/delete/{id}")
	  @ResponseStatus(HttpStatus.OK)
	  public void deleteEmployeeById(@PathVariable int id){
	    empService.deleteEmployeeById(id);
	  }
	
	

		
		@PutMapping("/update")
		//@ResponseStatus(HttpStatus.CREATED)
		  public Employee updateEmployee(@RequestBody Employee emp) {
		    return empService.updateEmployee(emp);
	}
		
		
		
		
		
		
	}
		

   
	
	
	

