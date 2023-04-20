package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import dto.IEmployee;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {
	
	private IEmployee employeeTarget;
	
	
	public EmployeeSalaryInvocationHandler(IEmployee employeeTarget) {
		this.employeeTarget = employeeTarget;
	}



	// Any call we make from main() it will call below method
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		//pre processing
		
		double hikeValue = (double)args[0];
		
		if(hikeValue <= 0.0) {
			
			throw new RuntimeException("Hike amount is not valid");
		}
		
		// making actual call to service layer
		
		//method --> which ever method we call from main()
		// args --> for that method what all argument we pass
		Object returnValue = method.invoke(employeeTarget, args);
		
		//post processing
		
		System.out.println("Executing method : "+ method.getName() + "for employee id "+employeeTarget.getId());
		
		
		return returnValue;
	}


}
