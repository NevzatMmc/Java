package java04;

import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;

import javax.swing.border.EtchedBorder;

public class ArraysForEach {

	public static void main(String[] args) {
//  for(type element : collection)
//		int[] arrray;
//		  Initialization, etc.
//		  for(int i : array)
//			  System.out.println(i);
		Random r = new Random();
		int randomInt = Math.abs(r.nextInt());
		int size = randomInt % 100;
		System.out.println("Size is " + size);
		int[] intArray = new int[size];
		
		for(int i = 0; i < intArray.length; i++) {
			randomInt = r.nextInt();
		int sayi = randomInt % 100;
		intArray[i] = sayi;
		}
		
		for(int i : intArray)
			System.out.print(i + " ");
		
		System.out.println();
	}

}
