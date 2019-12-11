public class Card {
	private int suit;
	private int face;
	private boolean drawn = false;

	public Card (int suitNum, int faceNum) {
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

	public Card () {
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
		drawn = true;
	}

	public boolean checkStatus() {
		return drawn;
	}

	public String toString() {
		String result;

		if (face == 0) {
			result = "Ace of ";
		} else if (face == 1) {
			result = "Two of ";
		} else if (face == 2) {
			result = "Three of ";
		} else if (face == 3) {
			result = "Four of ";
		} else if (face == 4) {
			result = "Five of ";
		} else if (face == 5) {
			result = "Six of ";
		} else if (face == 6) {
			result = "Seven of ";
		} else if (face == 7) {
			result = "Eight of ";
		} else if (face == 8) {
			result = "Nine of ";
		} else if (face == 9) {
			result = "Ten of ";
		} else if (face == 10) {
			result = "Jack of ";
		} else if (face == 11) {
			result = "King of ";
		} else {
			result = "Queen of ";
		}

		if (suit == 0) {
			result += "Spades";
		} else if (suit == 1) {
			result += "Diamonds";
		} else if (suit == 2) {
			result += "Clubs";
		} else {
			result += "Hearts";
		}

		return result;
	}

}
