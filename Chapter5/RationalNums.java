	public class RationalNums {
		public static void main(String[] args) {
			Rational r1 = new Rational(3, 4);
			Rational r2 = new Rational(3, 4);
			Rational r3 = new Rational(5, 4);
			Rational r4 = new Rational(2, 4);
			Rational r5 = new Rational(2, 3);
			
			System.out.println(r1.compareTo(r2));
			System.out.println(r1.compareTo(r3));
			System.out.println(r1.compareTo(r4));
			System.out.println(r3.compareTo(r3));
			System.out.println(r4.compareTo(r5));
	}
}
