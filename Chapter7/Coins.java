public class Coins {
	public static void main (final String[] args) {
		final MonetaryCoin Coin1 = new MonetaryCoin(25);
		final MonetaryCoin Coin2 = new MonetaryCoin(50);
		final MonetaryCoin Coin3 = new MonetaryCoin();
		System.out.println();
		System.out.println(Coin1.getValue() + Coin2.getValue());
		System.out.println(Coin3);
	}
}

