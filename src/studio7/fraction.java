package studio7;

public class fraction {
	private int numerator;
	private int denominator;
	private String value;
	
		public fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	public int gcd(int p, int q) {
		
		if(p%q == 0) {
			return q;
		}else {
			int temp=q;
			q=p%q;
			p=temp;
			return gcd(p,q);
		}
	
}
	public String simplify() {
		return numerator/gcd(numerator, denominator) + "/" + denominator/gcd(numerator, denominator);
	}
	
	 public int getNumerator()
	  {
	     return numerator;
	  }
	
	 public int getDenominator()
	  {
	     return denominator;
	  }
	
	public static String addFraction(fraction fraction1, fraction fraction2) {
		int fraction1n = fraction1.getNumerator()*fraction2.getDenominator();
		int fraction1d = fraction1.getDenominator()*fraction2.getDenominator();

		int fraction2n = fraction2.getNumerator()*fraction1.getDenominator();

		int newN = fraction1n + fraction2n;
		
		String newfrac = newN + "/" + fraction1d;
		return newfrac;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fraction a = new fraction(1,14);
		fraction b = new fraction(1,2);
		System.out.println(addFraction(a, b));
		
	}

}
