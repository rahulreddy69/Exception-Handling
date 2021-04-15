package day7.task1;

public class MainExecution {
	public static void main(String[] args) throws LocationException {
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		String locations[] = service.getEmployeeLocations();
		
		/*for(String empid, emplocation : codes,locations)
			System.out.println(empid);
		//for(String emplocation : locations)
			//System.out.println(emplocation);*/
		for(int i=0;i<codes.length;i++)
			System.out.println(codes[i]+" : "+locations[i]);
	}

}
