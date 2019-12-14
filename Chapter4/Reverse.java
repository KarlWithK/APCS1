import cs1.Keyboard;

public class Reverse {
	public static void main(String[] args) {
		String result = "", word;
		word = Keyboard.readString();
		for (int index = 0; index < word.length(); index += 2) {
			result += word.charAt(index) + " ";
		}	

		System.out.println(result);
		System.out.println((2.5 % 2));
	}	
}
