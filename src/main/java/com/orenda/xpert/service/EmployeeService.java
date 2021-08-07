package com.orenda.xpert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orenda.xpert.entity.Employee;
import com.orenda.xpert.repository.EmployeeRepository;

@Service
public class EmployeeService {
  
@Autowired
//nnnnnn
  private EmployeeRepository repository;

  public Employee getEmployeeById(int id) {
    return repository.findById(id).get();
  }

  public List<Employee> getAllEmployees(){
    return (List<Employee>) repository.findAll();
  }

  public void deleteEmployeeById(int id){
    repository.deleteById(id);
  }

  public Employee addEmployee(Employee emp) {
    return repository.save(emp);
  }

  public List<Employee> getEmployeeByLastName(String lastName) {
    return repository.findByLastName(lastName);
  }

public List<Employee> getEmployeeFirstName(String firstName) {
	return repository.findByLastName(firstName);
	
}

public List<Employee> getEmployeeByDept(String dept) {
	return repository.findByDept(dept);
}

public Employee updateEmployee(Employee emp) {
	
	System.out.println("git testing");
	
	return repository.save(emp);
	
	
	
}
}