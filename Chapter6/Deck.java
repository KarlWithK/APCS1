public class Deck {
	private Card[] Cards = new Card[52];

	public Deck() {
		int type = 0;
		for (int currentCard = 0; currentCard < Cards.length; currentCard++) {
			if (currentCard % 13 == 0 && currentCard != 0)
				type++;
			Cards[currentCard] = new Card(type, currentCard - (type * 13));
		}
	}

	public void shuffle() {
		for (int currentCard = 0; currentCard < Cards.length; currentCard++) {
			int random = (int) (Math.random() * 52) + 1;
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
