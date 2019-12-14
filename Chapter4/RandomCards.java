
public class RandomCards {
	public static void main (String[] args) {
		String result = "";
		int cardLimit = 20;
		for (int currentNum = 0; currentNum < cardLimit; currentNum++) {
			Card oneCard = new Card();
			result += oneCard + "\n";
		}

		System.out.print(result);
	}
}
