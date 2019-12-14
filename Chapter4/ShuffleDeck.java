public class ShuffleDeck {
	public static void main (String[] args) {
		DeckOfCards deck = new DeckOfCards();
		Card[] bruh = deck.fullDeck();
		bruh = deck.shuffle(bruh);
		while (bruh.length > 0) {
			bruh = deck.dealOneCard(bruh);
			System.out.println(deck.cardsLeft(bruh));
		}
	}
}
