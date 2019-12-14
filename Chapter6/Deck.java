public class Deck {
	private Card[] Cards = new Card[52];

	public Deck() {
		for (int currentCard = 0; currentCard < Cards.length; currentCard++) {
			if (currentCard < 13)
				Cards[currentCard] = new Card(0, currentCard);
			else if (currentCard < 26)
				Cards[currentCard] = new Card(1, currentCard - 13);
			else if (currentCard < 39)
				Cards[currentCard] = new Card(2, currentCard - 26);
			else
				Cards[currentCard] = new Card(3, currentCard - 39);
		}
	}

	public void shuffle() {
		for (int currentCard = 0; currentCard < Cards.length; currentCard++) {
			int random = (int) (Math.random() * 52);
			Card temp = Cards[currentCard];
			Cards[currentCard] = Cards[random];
			Cards[random] = temp;
		}
	}

	public int report() {
		int count = 0;
		for (int currentCard = 0; currentCard < Cards.length; currentCard++) {
			if (!Cards[currentCard].checkStatus())
				count++;
		}
		return count;
	}

	public Card dealOne(int num) {
		Cards[num].changeStatus();
		return Cards[num];
	}
}
