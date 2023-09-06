package java03;

import java.util.Scanner;

public class prımeNumber {

	public static void main(String[] args) {
	prımeNumber pn = new prımeNumber();
	System.out.println("Bir sayı giriniz= ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(pn.isPrime(n));
	
	}
	boolean isPrime(int n) {
		boolean prime = true;
		int i = 2;
		for(; i < n; i++) {
			if(n % i == 0) {
				prime = false;
				break;	
			}
		}
    if(!prime)
    	System.out.println("ilk bölen " + i);
       return prime;
	}

}
