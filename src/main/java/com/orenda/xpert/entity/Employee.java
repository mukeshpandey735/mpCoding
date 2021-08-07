package com.orenda.xpert.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
	
	  @Column(name="first_name")
	  
	  private String firstName;
	 
	  @Column(name="last_name")
	  private String lastName;				
	  
	  @Column(name="department")
	  private String dept;
	 
	  
	  public int getId() {
	    return id;
	  }
	  public void setId(int id) {
	    this.id = id;
	  }
	  public String getFirstName() {
	    return firstName;
	  }
	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }
	  public String getLastName() {
	    return lastName;
	  }
	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }
	  public String getDept() {
	    return dept;
	  }
	  public void setDept(String dept) {
	    this.dept = dept;
	  }

	  @Override
	  public String toString() {
	    return "Id= " + getId() + " First Name= " + 
	           getFirstName() + " Last Name= " + getLastName() + 
	           " Dept= "+ getDept();
	  }
	}
	
	
	

