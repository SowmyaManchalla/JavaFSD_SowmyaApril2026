package com.cg.eis.bean;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.bean.EmployeeService;
import com.cg.eis.bean.EmployeeException;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		EmployeeService service = new EmployeeService();
		
		System.out.println("Enter Name:");
		emp.setName(sc.next());
		
		System.out.println("Enter Salary:");
		emp.setSalary(sc.nextDouble());
		
		try
		{
			service.validateSalary(emp);
			System.out.println("\n--- Employee details");
			
			System.out.println("Name:"+emp.getName());
			System.out.println("Salary:"+emp.getSalary());
			System.out.println("Designation:"+emp.getDesignation());
			System.out.println("Insurance Scheme:"+emp.getInsuranceScheme());
		}
		catch(EmployeeException e)
		{
			System.out.println("Error: "+ e.getMessage());
			
		}
		sc.close();
		

	}

}
