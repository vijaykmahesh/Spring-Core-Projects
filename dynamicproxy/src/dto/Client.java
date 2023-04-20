package dto;

import java.lang.reflect.Proxy;

import proxy.EmployeeSalaryInvocationHandler;

public class Client {

	public static void main(String[] args) {
		
		ITEmployee employee  = new ITEmployee();
		employee.setId(1);
		employee.setName("vijay");
		employee.setSalary(25000);
		
		//directly calling
		
		//employee.giveHike(5000);
		
		EmployeeSalaryInvocationHandler empHandler = new EmployeeSalaryInvocationHandler(employee);
		
		
		//creating proxy object of IEmployee
		IEmployee employeeProxyCreated = (IEmployee)Proxy.newProxyInstance(
					ITEmployee.class.getClassLoader(), 
					new Class[] {IEmployee.class}, 
					empHandler);
		
		employeeProxyCreated.giveHike(5000); // this will call invoke() of EmployeeSalaryInvocationHandler
		
		System.out.println("Salary "+employee.getSalary());
		
		

	}

}
