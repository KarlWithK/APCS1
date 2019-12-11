import java.util.ArrayList;

public class DeckOfCards {
    private ArrayList<Card> Cards = new ArrayList<Card>();

    public DeckOfCards() {
        for (int currentCard = 0; currentCard < 52; currentCard++) {
            if (currentCard < 13)
                Cards.add(new Card(0, currentCard));
            else if (currentCard < 26)
                Cards.add(new Card(1, currentCard - 13));
            else if (currentCard < 39)
                Cards.add(new Card(2, currentCard - 26));
            else
                Cards.add(new Card(3, currentCard - 39));
        }
    }

    public void ShuffleDeck() {
        for (int index = 0; index < 52; index++) {
            int RandomInt = (int) (Math.random() * 51) + 1;
            Card temp = Cards.get(index);
            Cards.set(index, Cards.get(RandomInt));
            Cards.set(RandomInt, temp);
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

    public String Deal(int num) {
        Cards.get(num).changeStatus();
        return Cards.get(num).toString();
    }

}
