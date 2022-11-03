package studio7;

public class die {
	/**
	 * instance variables number
	 */
	private int number;
	public int roll() {
		return (int) ((Math.random()*number)+1);
	}

	/**
	 * 
	 * @param n, number of sides of the die
	 */
	public die(int n) {
		number=n;
	}

	public static void main(String[] args) {
		die game = new die(6);
		System.out.print(game.roll());
	}
}

