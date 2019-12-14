import cs1.Keyboard;

public class ReadString {
	public static void main(String[] args) {
		String character, fullString;
		int limit, index = 0;

		System.out.println("State a string to print out all its character one at a time");

		fullString = Keyboard.readString();
		limit = fullString.length();

		System.out.println("   ");

		while (index < limit) {
			System.out.println(fullString.charAt(index));
			index ++;
		}
		
		System.out.println("   ");
		System.out.println("Program Closed");
	}
}
