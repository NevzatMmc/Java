package java04;

public class ArrayAsParametrer {

	public static void main(String[] args) {
     int[] array1 = new int[3];
     array1[0] = 17;
     array1[1] = 22;
     array1[2] = -8;
     
     
     calculaterAvarage(array1);
     
     
     int[] array2 = {81, 19, -14};
     calculaterAvarage(array2);
     
     calculaterAvarage(new int[] {43, 25, 99});
     
     calculaterAvarage(new int[3]);
		

	}
	public static void calculaterAvarage(int[] array) {
		double total = 0;
		for(int i : array)
		 total += i;
		System.out.println("Average is " + total / array.length);
	}

	
}
