package java05;

import java.time.Year;

import javax.print.DocFlavor.BYTE_ARRAY;
import javax.print.attribute.standard.PrinterMakeAndModel;
import javax.smartcardio.Card;

public class test {

	public static void main(String[] args) {
		car myCar = new car();
		System.out.println("My car; "+ myCar.year + " " + myCar.make + " " + myCar.speed );
		myCar.make = "mercedes";
		myCar.model = "E200";
		myCar.year = "2011";
		myCar.speed = 80;
		myCar.distance = 30_000;
		
		System.out.println("My car; "+ myCar.year + " " + myCar.make + " " + myCar.speed );
		
		car yourCar = new car();
		yourCar.make = "Toyota";
		yourCar.model = "Camry";
		yourCar.year = "2023";
		yourCar.speed = 123;
		yourCar.distance = 0;
		
		System.out.println("My car; "+ yourCar.year + " " + yourCar.make + " " + yourCar.speed );
		
		
		Person nevzat = new Person();
		nevzat.id = "1311";
		nevzat.firstName = "Nevzat";
		nevzat.lastName = "MAMAC";
		
		car mercedes = new car();
		mercedes.model = "E200";
		mercedes.make = "Mercedes";
		mercedes.year = "2023";
		
		mercedes.owner = nevzat;
		nevzat.vehicle = mercedes;
		
		System.out.println(mercedes.getInfo());
		System.out.println(nevzat.getInfo());
		
	}
	

}
