public class Card {
	private int suit;
	private int face;

	public Card (int suitNum, int faceNum) {
		if (suitNum < 5 && suitNum > 0) {
			suit = suitNum;
		} else {
			suit = (int) (Math.random() * 4) + 1;
		}

		if (faceNum < 14 && faceNum > 0) {
			face = faceNum;
		} else {
			face = (int) (Math.random() * 13) + 1;
		}
	}

	public Card () {
		suit = (int) (Math.random() * 4) + 1;
		face = (int) (Math.random() * 13) + 1;
	}

	public int getSuit() {
		return suit;
	}

	public int getFace() {
		return face;
	}

	public String toString() {
		String result;

		if (face == 1) {
			result = "Ace of ";
		} else if (face == 2) {
			result = "Two of ";
		} else if (face == 3) {
			result = "Three of ";
		} else if (face == 4) {
			result = "Four of ";
		} else if (face == 5) {
			result = "Five of ";
		} else if (face == 6) {
			result = "Six of ";
		} else if (face == 7) {
			result = "Seven of ";
		} else if (face == 8) {
			result = "Eight of ";
		} else if (face == 9) {
			result = "Nine of ";
		} else if (face == 10) {
			result = "Ten of ";
		} else if (face == 11) {
			result = "Jack of ";
		} else if (face == 12) {
			result = "King of ";
		} else {
			result = "Queen of ";
		}

		if (suit == 1) {
			result += "Spades";
		} else if (suit == 2) {
			result += "Diamonds";
		} else if (suit == 3) {
			result += "Clubs";
		} else {
			result += "Hearts";
		}

		return result;
	}

}
