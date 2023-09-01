package java03;

import java.util.Iterator;

public class loops {

	public static void main(String[] args) {
		// while -- do-while and for 
		double r = Math.random();
		System.out.println("r = " + r);
		while (r < 0.8) {
			r = Math.random();
		   System.out.println("in while " + r);
		}
			System.out.println("after while");
		
			System.out.println("*******************************");
			
			double m;
			do {
				m = Math.random();
				System.out.println("m= in do while " + m);
			} while (m < 0.8);
			
			System.out.println("*****************************************");
			
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				 sum += i;
				 System.out.println("sum: " + sum);
				 
				 System.out.println("\nMultiplication table");
				 
				 
				 System.out.println("**************************");
				 
				
				 for (int i1 = 1; i1 <= 10; i1++) {
					 for (int j = 1; j <= 10; j++) {
						 System.out.format("%4d", i1 * j);
					 }
					 System.out.println();
				 }
			}
	}

}
