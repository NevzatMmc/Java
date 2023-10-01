package java04;

import java.util.Random;

public class ArrayDemo {
	static int[] intArray = new int[10];
	static Pizza pizzas[] = new Pizza[3];
	static boolean[] flags = {true , false};
	
	public static void main(String[] args) {
		
		initializeArrays();
		printArrays();
		
			                                
	}
	public static void initializeArrays() {
		System.out.println("\ninitialize Arrays");
		
		Random r = new Random();
		for(int i = 0; i < intArray.length; i++) {
			int randomInt = r.nextInt();
			int sayi = randomInt % 100;
			intArray[i] = sayi;
		}
			pizzas[0] = new Pizza("peynirli");
			pizzas[1] = new Pizza("sucuklu");
			pizzas[2] = new Pizza("karışık");
			
	}
	public static void printArrays() {
		System.out.println("Printing arrays");
		
		for(int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i] + " ");
		System.out.println();
		System.out.println("pizzas: " + pizzas[0].name + " " + pizzas[1].name + " " + pizzas[2].name);
		
		Pizza p = pizzas[0];
		System.out.println("Pizzas: " + p.name);
		
		System.out.println("\nFifth element of intArray is " + intArray[4]);
		System.out.println("First element of flag is " + flags[1]);
		System.out.println("Name of the last element of pizzas is " + pizzas[0].name);
		
		
		
		
	}

}
