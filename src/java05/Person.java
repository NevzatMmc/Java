package java05;

public class Person {
	String id;
	String firstName;
	String lastName;
	
	
	car vehicle;
	
	public String getInfo() {
		String info = "Person info: " + id + " " + firstName + " " + lastName;
		if(vehicle != null)
			info += "and has a car : " + vehicle.getInfo();
		else 
			info += " and has no car. ";
		return info;
		
	}
}
