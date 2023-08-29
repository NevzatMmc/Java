package java01;

public class FootbalPlayerTest {

	public static void main(String[] args) {
		FootballPlayer alex = new FootballPlayer();
		alex.no = 10;
		alex.name = "Alex De Souza";
		alex.inPlay = true;
		alex.minutes = 0;
		alex.numberOfGoals = 0;
		
		
		alex.play(90);
		alex.score();
		alex.score();
		
		System.out.println("number of goals alex scored " + alex.numberOfGoals);
		System.out.println("Alex played Totaly " + alex.minutes + " minutes so far.");

	}

}
