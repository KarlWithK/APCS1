import java.util.Arrays;

public class TestingCards {
	public static void main (String[] agrs) {
		String[] Cards = new String[20];
		String ListOfCards = "";
		for (int currentCard = 0; currentCard < Cards.length; currentCard++) {
			Cards[currentCard] = new Card().toString();
			String[] checking = Arrays.copyOfRange(Cards, 0, currentCard);
			while (Arrays.asList(checking).contains(Cards[currentCard])) {
				Cards[currentCard] = new Card().toString();
			}

			ListOfCards += Cards[currentCard] + "\n";
		}

		System.out.print(ListOfCards);

		//Card[] Cards = new Card[5];
		//String ListOfCards = "";
		//for (int currentCard = 0; currentCard < Cards.length; currentCard++) {
			//Cards[currentCard] = new Card();
			//ListOfCards += Cards[currentCard] + "\n";
		//}	
		//System.out.println(ListOfCards);


		//String[] testing = new String[3];
		//for (int bruh = 0; bruh < testing.length; bruh++) {
			//testing[bruh] = new Card(2, 1).toString();
			//System.out.println(testing[bruh]);
			//String[] nani = Arrays.copyOfRange(testing, 0, bruh);
			//System.out.println(Arrays.asList(nani).contains(testing[bruh]));
			//while (Arrays.asList(nani).contains(testing[bruh])) {
				//testing[bruh] = new Card().toString();
				//System.out.println("doing something");
			//}
			//System.out.println("    ->       " + testing[bruh] + "\n");
		//}
	}
}
