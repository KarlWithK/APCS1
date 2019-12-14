import cs1.Keyboard;

public class Palindrome {
	public static void main(String[] agrs) {
		String target, realTarget, another = "Y";
		char currentLetter;
		int index, limit, right, left;

		while (another.equalsIgnoreCase("Y")) {
			System.out.println("Enter a potential palindrome");
			target = Keyboard.readString();
			target = target.toLowerCase();
			limit = target.length();
			index = 0;
			realTarget = "";

			while (index < limit) {
				currentLetter = target.charAt(index);
				if (97 <= (int) currentLetter && (int) currentLetter <= 122) {
					realTarget += currentLetter;
				}
				index++;
			}

			left = 0;
			right = realTarget.length() - 1;

			while (realTarget.charAt(left) == realTarget.charAt(right) && left < right) {
				left++;
				right--;
			}

			System.out.println();

			if (left < right) {
				System.out.println("That string is NOT a palindrome.");
			} else {
				System.out.println("That string IS a palindrome.");
			}

			System.out.println();
			System.out.print("Test another palindrome (y/n)? ");
			another = Keyboard.readString();
		}

		System.out.println("\nProgram Closed");
	}
}
