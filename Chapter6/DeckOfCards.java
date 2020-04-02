import java.util.ArrayList;

public class DeckOfCards {
	private ArrayList<Card> Cards = new ArrayList<Card>();

	public DeckOfCards() {
		int type = 0;
		for (int currentCard = 0; currentCard < 52; currentCard++) {
			if (currentCard % 13 == 0 && currentCard != 0)
				type++;
			Cards.add(new Card(type, currentCard - (type * 13)));
		}
	}

	public void shuffleDeck() {
		for (int index = 0; index < 52; index++) {
			int randomInt = (int) (Math.random() * 52) + 1;
			Card temp = Cards.get(index);
			Cards.set(index, Cards.get(randomInt));
			Cards.set(randomInt, temp);
		}
	}

	public int reportCardLeft() {
		int count = 0;
		for (int index = 0; index < 52; index++) {
			if (!Cards.get(index).checkStatus())
				count++;
		}
		return count;
	}

	public Card deal(int num) {
		Cards.get(num).changeStatus();
		return Cards.get(num);
	}

}
