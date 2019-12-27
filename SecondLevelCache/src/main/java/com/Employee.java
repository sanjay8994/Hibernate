package com;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;  

@Entity  
@Table(name = "employeeCache") 
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  
public class Employee {  

@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
@Id	
private int id;  
private String name;  
 


public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}  



}  