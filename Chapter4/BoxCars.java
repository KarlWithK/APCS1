public class BoxCars {
	public static void main(String[] agrs) {
		PairOfDice dice = new PairOfDice();
		final int totalRolls = 1000;
		int countSix = 0;
		for (int roll = 0; roll < totalRolls; roll++) {
			if (dice.equalFaces(6)) {
				countSix++;
			}
		}

		System.out.println(countSix);
	} 
}
