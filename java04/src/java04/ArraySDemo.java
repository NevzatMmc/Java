package java04;

import java.awt.FocusTraversalPolicy;
import java.awt.print.Printable;
import java.util.Iterator;
import java.util.Random;

public class ArraySDemo {
	int[] intArray = new int[20];
	Pizza[] pizzalar = new Pizza[3];
	boolean[] flags = {true, false};
	
	public void initilialize() {
		for(int i = 0; i < intArray.length; i++) {
			Random r = new Random();
			int randomInt = r.nextInt();
			int sayi = randomInt % 100;
			intArray[i] = sayi;
		}
		System.out.print("Original Array: ");
		print(intArray);
		
		pizzalar[0] = new Pizza("Peynirli ");
		pizzalar[1] = new Pizza("Sucuklu ");
		pizzalar[2] = new Pizza("Sebzeli ");
	}

	public static void main(String[] args) {
		ArraySDemo demo = new ArraySDemo();
		demo.initilialize();
     
	}
	public void print(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}
}
