package java03;

public class BreakAndContinue {

	public static void main(String[] args) {
     System.out.println("Break ");
     for(int i = 1; i <= 5; i++) {
    	 if(i == 4)
    		 break; // Terminate loop.
     System.out.println("i " + i + "\t" + Math.sqrt(i));
	}
     System.out.println("\nContinue");
     for (int j = 1; j <= 5; j++){
    	 if(j == 4)
    		 continue; // Terminate only this step.
    	 System.out.println("j " + j + "\t" + Math.sqrt(j));
    }
   }
  }
