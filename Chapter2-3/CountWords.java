import cs1.Keyboard;
import java.util.StringTokenizer;

public class CountWords {
	public static void main(String[] args) {
		int wordCount = 0, characterCount = 0;
		String line, word;
		StringTokenizer tokenizer;

		System.out.println("Please enter text (type DONE to quit):");
		line = Keyboard.readString();

		while (!line.equals("DONE")) {

			tokenizer = new StringTokenizer (line,",.!;:\"?()[]''-");

			while (tokenizer.hasMoreTokens()) {
				word = tokenizer.nextToken();
				wordCount++;
				characterCount += word.length();
			}

			line = Keyboard.readString();
		}

		System.out.println("NUmber of words: " + wordCount);
		System.out.println("Number of characters: " + characterCount);

	}
}
