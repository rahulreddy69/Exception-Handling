package day7.task1;

public class EmployeeService {
	private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};
	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		for(String empid : employees)
			codes[++count] = empid.substring(0, 3);
		
		return codes;
	}
	
	public String[] getEmployeeLocations() throws LocationException
	{
		String locations[] = new String[employees.length];
		int count = -1;
		for(String empid : employees) {
			if(empid.substring(6, 9).equals("011"))
				locations[++count] = "Delhi";
			else if(empid.substring(6, 9).equals("022"))
				locations[++count] = "Mumbai";
			else if(empid.substring(6, 9).equals("080"))
				locations[++count] = "Bangalore";
			else if(empid.substring(6, 9).equals("020"))
				locations[++count] = "Pune";
			else {
				throw new LocationException("not found with location code"+empid.substring(6, 9));
			}
		}
		return locations;
	}
	

}
