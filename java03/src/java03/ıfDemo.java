package java03;

public class ıfDemo {

	public static void main(String[] args) {
		int s1 = 60;
		int s2 = 75;
		 
		if(s1 > s2){
		System.out.println(s1 + " büyüktür " + s2+ " sayısından");
		}
		else if(s1 < s2){
		System.out.println(s1 + " küçüktür " + s2+ " sayısından");
		}
		else{
		System.out.println(s1 + " eşittir " + s2);
		}
		
		
		int yil = 2016;


		if((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0)))
		System.out.println( + yil + " yılı artık bir yıldır");
		else
		System.out.println( yil + " yılı artık yıl değildir");
		
	}	
	
}



		

	


