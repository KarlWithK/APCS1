import cs1.Keyboard;

public class DigitsFor {
	public static void main(String[] args) {
		int num, zeros = 0, odds = 0, evens = 0;

		System.out.println("Pick a number to see what types of digits it has\n");

		for (num = Keyboard.readInt(); num >= 1; num /= 10) {
			if (num % 10 == 0) {
				zeros++;
				evens++;
			} else if (num % 2 == 0) {
				evens ++;
			} else {
				odds++;
			}
		}

		System.out.println("\nThe number you picked has " + zeros + " zero(s), " + evens + " even digit(s), and " + odds + " odd digit(s).\n\nProgram Closed");

	}
}
