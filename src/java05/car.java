package java05;

public class car {
	String make;
	String model;
	String year;
	int speed;
	int distance;
	Person owner;
	
	public String getInfo(){
		String info = "Car info: " + year + " " + make + " " + model;
		if(owner != null)
			info += "and its owner is " + owner.firstName + " " + owner.lastName;
		else 
			info += "and does not have an owner!";
			return info;
	}
}
