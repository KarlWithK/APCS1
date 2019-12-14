public class PairOfDice {
	private Die die1 = new Die();
	private Die die2 = new Die();

	public boolean equalFaces(int face) {
		return die1.roll() == face && die2.roll() == face;
	} 

	public int faceRoll(int target, String user) {
		int currentDie1 = die1.roll();
		int currentDie2 = die2.roll();
		System.out.println(user + " rolled: " + currentDie1 + " and " + currentDie2 + ". Based on this...");
		if (currentDie1 == target && currentDie2 == target) {
			return -1;
		}
		if (currentDie1 == target || currentDie2 == target) {
			return 0;
		}  else {
			return currentDie1 + currentDie2;	
		}

	}
}
