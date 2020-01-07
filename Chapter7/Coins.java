public class Coins {
	public static void main (String[] args) {
		MonetaryCoin Coin1 = new MonetaryCoin(25);
		MonetaryCoin Coin2 = new MonetaryCoin(50);
		MonetaryCoin Coin3 = new MonetaryCoin();
		System.out.println();
		System.out.println(Coin1.getValue() + Coin2.getValue());
		System.out.println(Coin3);
	}
}

