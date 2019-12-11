public class ShuffleDeck {
    public static void main(String[] args) {
        DeckOfCards Deck = new DeckOfCards();
        Deck.ShuffleDeck();
        for (int index = 0; index < 52; index ++) {
            System.out.println(Deck.Deal(index));
            System.out.println(Deck.reportCardLeft());
        }
    }
}
