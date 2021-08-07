package com.orenda.xpert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orenda.xpert.entity.Employee;


@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByLastName(String lastName);

	List<Employee> findByDept(String dept);

	List<Employee> findByFirstName(String firstName);

	


}
