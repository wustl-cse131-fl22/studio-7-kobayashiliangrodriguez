package studio7;

public class rectangle {
	/**
	 * 
	 * instance variables length and width
	 */
	private double length;
	private double width;

	public double area() {
		return length * width;
	}

	public double perimeter() {
		return 2 * length + 2 * width;
	}

	/**
	 * 
	 * @param l, length of the rectangle
	 * @param w, width of the rectangle
	 */
	public rectangle(double l, double w) {
		length = l;
		width = w;

	}

	public static void main(String[] args) {
		rectangle big = new rectangle(14.0, 400.0);
	}
}
