package com.hibernate.EmployeeManagementSystem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	int salary;
	
	@Column
	String email;
	
	@Column
	int phone;
	
	
	public Employee() {
		
	}


	public Employee(int id, String name, int salary, String email, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.phone = phone;
	}


	public Employee(String name, int salary, String email, int phone) {
		super();
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.phone = phone;
	}


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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
}
