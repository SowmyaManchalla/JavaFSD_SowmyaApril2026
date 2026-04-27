package com.cg.eis.bean;
import com.cg.eis.bean.Employee;
import com.cg.eis.bean.EmployeeException;

public class EmployeeService {
	
	public void validateSalary(Employee emp) throws EmployeeException
	
	{
		double salary = emp.getSalary();
		
		if(emp.getSalary()<3000)
		{
			throw new EmployeeException("Salary is below 3000, not allowed");
		}
		
		if(salary>=3000 && salary<=5000)
		{
			emp.setDesignation("System admin");
			emp.setInsuranceScheme("No Scheme");
		}
		else if(salary<=2000)
		{
			emp.setDesignation("Systems engineer");
			emp.setInsuranceScheme("Scheme C");
		}
		else if(salary<=4000)
		{
			emp.setDesignation("Programmer");
			emp.setInsuranceScheme("Scheme B");
		}
		else
		{
			emp.setDesignation("Manager");
			emp.setInsuranceScheme("Scheme A");
		}
	}

}
