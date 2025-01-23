package com.hibernate.EmployeeManagementSystem;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	static SessionFactory factory = null;
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
       
    	factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	while(true) {
    		System.out.println("=======================================");
    		System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM.");
    		System.out.println("=======================================");
    		System.out.println("PRESS 1 FOR FETCHING EMPLOYEE.");
    		System.out.println("PRESS 2 FOR ADDING NEW EMPLOYEE.");
    		System.out.println("PRESS 3 FOR UPDATING EMPLOYEE.");
    		System.out.println("PRESS 4 FOR DELETING EMPLOYEE.");
    		System.out.println("ANY OTHER NUMBER TO STOP.");
    		int choice = sc.nextInt();
    		switch(choice) {
    		case 1 -> getEmployee();
    		case 2 -> insertEmployee();
    		case 3 -> updateEmployee();
    		case 4 -> deleteEmployee();
    		default -> {
    			factory.close();
    			sc.close();
    			System.out.println("==============================================");
    			System.out.println("THANK YOU FOR USING EMPLOYEE MANAGEMENT SYSTEM");
    			System.out.println("==============================================");
    			return;
    		    }
    		}
    	}
    }
    
    
    public static void insertEmployee() {
    	
    	System.out.println("Enter Employee Name, Salary, Email and Phone");
    	Employee employee = new Employee(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(employee);
    	transaction.commit();
    	session.close();
    	
    }
    
    public static void deleteEmployee() {
    	
    	System.out.println("Enter Employee ID to delete");
    	int id = sc.nextInt();
    	
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	Employee obj = session.get(Employee.class, id);
    	if (obj != null) {
    		session.remove(obj);
    		transaction.commit();
    		System.out.println("Employee with ID " + id + "deleted successfully");
    		session.close();
    	}
    	else {
    		System.out.println("Employee with ID " + id + "does not exist.");
    	}
    }
    
    public static void updateEmployee() {
    	
    	System.out.println("Enter Employee ID to update");
    	int id = sc.nextInt();
    	
       Session session = factory.openSession();
       Transaction transaction = session.beginTransaction();
       Employee obj = session.get(Employee.class, id);
       if (obj != null) {
    	   
    	   System.out.println("Current Details....");
    	   System.out.println("Name: " + obj.getName() + " " + "Salary: " + obj.getSalary() + " " + "Email: " + obj.getEmail() + " " + "Phone: " + obj.getPhone());
    	   System.out.println("Select any one of below to change");
    	   System.out.println("====================================");
    	   System.out.println("Name  |  Salary  |  Email  |  Phone");
    	   System.out.println("====================================");
    	   String choice = sc.next().toLowerCase();
    	   
    	   switch(choice) {
    	   case "name" -> {
    		   System.out.println("Enter New Name");
    		   String name = sc.next();
    		   obj.setName(name);
    	     }
    	   case "salary" -> {
    		   System.out.println("Enter New Salary");
    		   int salary = sc.nextInt();
    		   obj.setSalary(salary);
    	     }
    	   case "email" -> {
    		   System.out.println("Enter New Email");
    		   String email = sc.next();
    		   obj.setName(email);
    	     }
    	   case "phone" -> {
    		   System.out.println("Enter New Phone");
    		   int phone = sc.nextInt();
    		   obj.setSalary(phone);
    	     }
    	   }
    	   transaction.commit();
    	   
       }
       else {
    	   System.out.println("Employee with ID " + id + "does not exist.");
       }
       session.close();
    	
    }
    
    
    public static void getEmployee() {
    	System.out.println("Enter Employee ID to Fetch");
    	int id = sc.nextInt();
    
      Session session = factory.openSession();
      Transaction transaction = session.beginTransaction();
      Employee obj =session.get(Employee.class, id);
      if (obj != null) {
    	  
    	  System.out.println("ID: " + obj.getId() + " Name: " + obj.getName() + " Salary: " + obj.getSalary() + " " + " Email: " + obj.getEmail() + " " + " Phone: " + obj.getPhone());
    	  transaction.commit();
      }
      else {
    	  System.out.println("Employee with ID " + id + "does not exist.");
      }
      
      session.close();
    	
    }
}
