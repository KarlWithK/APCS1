import java.util.Arrays;

public class DeckOfCards {
    private Card[] cardDeck = new Card[52];
    private int faceNum = 1, suitNum = 1;
    public Card[] fullDeck () {
        for (int currentCard = 0; currentCard < cardDeck.length; currentCard++) {
            if (currentCard % 13 == 0) {
                faceNum = 1;
            } else {
                faceNum ++;
            }
            if (currentCard % 13 == 0) {
                suitNum ++;
            }
            cardDeck[currentCard] = new Card(suitNum, faceNum);
        }
        return cardDeck;
    }

    public Card[] shuffle(Card[] cardDeck) {
        int length = cardDeck.length, suitNum, faceNum;
        String[] order = new String[length];
        Card[] Cards = new Card[length];
        for (int currentCard = 0; currentCard < order.length; currentCard++) {
            Card placeHolder = new Card();
            suitNum = placeHolder.getSuit();
            faceNum = placeHolder.getFace();
            order[currentCard] = placeHolder.toString();
            Cards[currentCard] = new Card(suitNum, faceNum);
            String[] checking = Arrays.copyOfRange(order, 0, currentCard);
            while (Arrays.asList(checking).contains(order[currentCard])) {
                Card uniqueCard = new Card();
                suitNum = uniqueCard.getSuit();
                faceNum = uniqueCard.getFace();
                order[currentCard] = uniqueCard.toString();
                Cards[currentCard] = new Card(suitNum, faceNum);
            }
        }
        return Cards;
    }

    public String shufflePrint(Card[] cardDeck) {
        int length = cardDeck.length;
        String[] Cards = new String[length];
        String ListOfCards = "";
        for (int currentCard = 0; currentCard < Cards.length; currentCard++) {
            Cards[currentCard] = new Card().toString();
            String[] checking = Arrays.copyOfRange(Cards, 0, currentCard);
            while (Arrays.asList(checking).contains(Cards[currentCard])) {
                Cards[currentCard] = new Card().toString();
            }
            ListOfCards += Cards[currentCard] + "\n";
        }
        return ListOfCards;
    }

    public String cardsLeft(Card[] cardDeck) {
        return "The amount of Cards left is " + Integer.toString(cardDeck.length);
    }

    public Card[] dealOneCard(Card[] cardDeck) {
        int length = cardDeck.length;
        int randomCard = (int) (Math.random() * length);
        Card removedCard = cardDeck[randomCard];
        System.out.println (removedCard);
        if (randomCard + 1 == length) {
            Card[] reducedDeck = Arrays.copyOfRange(cardDeck, 0, length - 1);
            return reducedDeck;
        } else if (randomCard == 0) {
            Card[] reducedDeck = Arrays.copyOfRange(cardDeck, randomCard + 1, length);
            return reducedDeck;
        } else {
            Card[] part1 = Arrays.copyOfRange(cardDeck, 0, randomCard);
            Card[] part2 = Arrays.copyOfRange(cardDeck, randomCard + 1, length);
            length--;
            Card[] reducedDeck = new Card[length];
            int currentCard = 0;
            for (Card element : part1) {
                reducedDeck[currentCard] = element;
                currentCard++;
            }
            for (Card element : part2) {
                reducedDeck[currentCard] = element;
                currentCard++;
            }

            return reducedDeck;
        }
    }

}
