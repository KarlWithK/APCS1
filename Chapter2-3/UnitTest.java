import cs1.Keyboard;

public class UnitTest {
	public static void main(String[] args) {
		int count = 0;
		int what = (int) (Math.random() * 26) + 1;
		char letter;
		letter = Keyboard.readChar();
		char winner = (char) (what + 96);
		while (letter != winner) {
			if (letter < 96 || letter > 122) {
				System.out.println("Letters only");
				letter = Keyboard.readChar();
			}

			if (letter < winner) {
				System.out.println("Too low");
				letter = Keyboard.readChar();
			} else {
				System.out.println("too high");
				letter = Keyboard.readChar();
			}

			count++;
		}		

		System.out.println("You guess right" + count);
	}
} 
