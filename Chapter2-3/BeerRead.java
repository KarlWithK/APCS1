import cs1.Keyboard;
import java.util.StringTokenizer;


public class BeerRead {
	public static void main(String[] args) {
		int numVerses, check = 0;
		String Song, line;
		StringTokenizer tokenizer;

		Song = "100 bottles of beer on the wall \n" +
			"100 bottles of beer \n" +
			"If one of those bottles should happen to fall \n" +
			"99 bottles of beer on the wall \n" +
			"99 bottles of beer on the wall \n" + 
			"99 bottles of beer \n" +
			"If one of those bottles should happen to fall \n" +
			"98 bottles of beer on the wall \n";

		System.out.println ("Please enter the number of verses you want to be printed out. There are 8 verses so pick a number between 0 and 8");
		numVerses = Keyboard.readInt();
		System.out.println("\n");
		tokenizer = new StringTokenizer(Song, "\n");

		while (tokenizer.hasMoreTokens() && numVerses > check && numVerses < 9) {
			line = tokenizer.nextToken();
			System.out.println(line);
			check ++;
		}
		
		System.out.println("\nProgram Closed");
	}
}
