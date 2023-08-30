package java01;

public class FootballPlayer {
	public int no;
	public String name;
	public boolean inPlay;
	public int minutes;
	public int numberOfGoals;
	
    void play(int minutesToPlay) {
    	minutes = minutes + minutesToPlay;
    }
	void score() {
		numberOfGoals = numberOfGoals + 1;
	}
}