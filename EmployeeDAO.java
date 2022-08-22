package com.example.demo;

import java.util.List;

public interface EmployeeDAO {

	
		public void addEmployee(Employee emp);
		public void updateEmployee(Employee emp);
		public void deleteEmployee(int eno);
		public Employee getEmployee(int eno);
		public List<Employee> getEmployees();
}
