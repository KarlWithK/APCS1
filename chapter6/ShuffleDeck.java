public class ShuffleDeck {
    public static void main(String[] args) {
        DeckOfCards Deck = new DeckOfCards();
        Deck.shuffleDeck();
        for (int index = 0; index < 52; index ++) {
            System.out.println(Deck.deal(index));
            System.out.println(Deck.reportCardLeft());
        }
    }
}
