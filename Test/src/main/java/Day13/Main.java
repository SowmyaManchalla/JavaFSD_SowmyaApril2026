package Day13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service = new EmployeeService();
		
		try
		{
			Employee e1 = new Employee(1,"Sowmya",5000, "Developer");
			Employee e2 = new Employee(2,"Anil", 2500, "Tester");
			
			service.validateEmployee(e1);
			service.writeEMployee(e1);
			
			service.validateEmployee(e2);
			service.writeEMployee(e2);
		}
		catch(EmployeeException e)
		{
			System.out.println("Validation error:" +e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("File error: "+e);
		}
		
		try
		{
			service.readEmployees();
		}
		catch(Exception e)
		{
			System.out.println("Read Error:"+e);
		}

	}

}
