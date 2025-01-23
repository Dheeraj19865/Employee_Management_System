**Employee Management System**

This project implements an Employee Management System using Hibernate for data persistence. It allows you to manage employee information, including adding, fetching, updating, and deleting employees from a database.

**Prerequisites:**

- Java Development Kit (JDK) 11 or later
- Maven (or a similar build tool)
- A database server (e.g., MySQL, PostgreSQL)
- The appropriate JDBC driver for your chosen database


**Configuration:**

1. Create a `hibernate.cfg.xml` file in the project's root directory.
2. Configure the following settings in `hibernate.cfg.xml`:
   - Database connection details (URL, username, password)
   - Dialect (e.g., `org.hibernate.dialect.MySQLDialect` for MySQL)
   - Entity mappings (mapping Java classes to database tables)


**Features:**

- Add new employees
- Fetch employee details by ID
- Update existing employee information
- Delete employees

------**Example Usage:**------------

```
=======================================
WELCOME TO EMPLOYEE MANAGEMENT SYSTEM.
=======================================
PRESS 1 FOR FETCHING EMPLOYEE.
PRESS 2 FOR ADDING NEW EMPLOYEE.
PRESS 3 FOR UPDATING EMPLOYEE.
PRESS 4 FOR DELETING EMPLOYEE.
ANY OTHER NUMBER TO STOP.

1  // Fetch employee by ID
Enter Employee ID to Fetch
123

ID: 123 Name: John Doe Salary: 50000 Email: john.doe@example.com Phone: 1234567890

=======================================
WELCOME TO EMPLOYEE MANAGEMENT SYSTEM.
=======================================
PRESS 1 FOR FETCHING EMPLOYEE.
PRESS 2 FOR ADDING NEW EMPLOYEE.
PRESS 3 FOR UPDATING EMPLOYEE.
PRESS 4 FOR DELETING EMPLOYEE.
ANY OTHER NUMBER TO STOP.

2  // Add a new employee
Enter Employee Name, Salary, Email and Phone
Jane Smith 60000 jane.smith@example.com 9876543210

=======================================
WELCOME TO EMPLOYEE MANAGEMENT SYSTEM.
=======================================
PRESS 1 FOR FETCHING EMPLOYEE.
PRESS 2 FOR ADDING NEW EMPLOYEE.
PRESS 3 FOR UPDATING EMPLOYEE.
PRESS 4 FOR DELETING EMPLOYEE.
ANY OTHER NUMBER TO STOP.

3  // Update an employee
Enter Employee ID to update
123

Current Details....
Name: John Doe Salary: 50000 Email: john.doe@example.com Phone: 1234567890
Select any one of below to change
======================================
Name  |  Salary  |  Email  |  Phone
======================================

name  // Update employee name
Enter New Name
Alice

=======================================
WELCOME TO EMPLOYEE MANAGEMENT SYSTEM.
=======================================
PRESS 1 FOR FETCHING EMPLOYEE.
PRESS 2 FOR ADDING NEW EMPLOYEE.
PRESS 3 FOR UPDATING EMPLOYEE.
PRESS 4 FOR DELETING EMPLOYEE.
ANY OTHER NUMBER TO STOP.

0  // Exit the application
==============================================
THANK YOU FOR USING EMPLOYEE MANAGEMENT SYSTEM
==============================================
```

**Additional Notes:**

- You can customize the behavior of the application by modifying the `App.java` class.
