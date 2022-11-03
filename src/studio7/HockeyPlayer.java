package studio7;

public class HockeyPlayer {
private String name;
private int jn;
private boolean hand;
private String shoot;
private int gameplayed;
private int goals;
private int assists;
	
public double points() {
	return goals + assists;
}

public HockeyPlayer(int a, int g) {
	goals = g;
	assists = a;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
