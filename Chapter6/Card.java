public class Card {
	private int suit;
	private int face;
	private boolean drawn = false;

	public Card(int suitNum, int faceNum) {
		if (suitNum < 4 && suitNum > -1) {
			suit = suitNum;
		} else {
			suit = (int) (Math.random() * 3) + 1;
		}

		if (faceNum < 13 && faceNum > -1) {
			face = faceNum;
		} else {
			face = (int) (Math.random() * 12) + 1;
		}
	}

	public Card() {
		suit = (int) (Math.random() * 3) + 1;
		face = (int) (Math.random() * 12) + 1;
	}

	public int getSuit() {
		return suit;
	}

	public int getFace() {
		return face;
	}

	public void changeStatus() {
		this.drawn = true;
	}

	public boolean checkStatus() {
		return drawn;
	}

	public String toString() {
		String[] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "King", "Queen"};
		String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
		return faces[this.face] + " of " + suits[this.suit];
	}

}
