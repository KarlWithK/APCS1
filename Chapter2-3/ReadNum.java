import cs1.Keyboard;

public class ReadNum {
	public static void main(String[] args) {
		int evens = 0, odds = 0, zeros = 0, value, limit, index = 0, temp;
		String fullString, placeHolder;

		System.out.println("Please state an int you would like to check the number of even, odd, zero digits it has.");

		value = Keyboard.readInt();
		fullString = Integer.toString(value);
		limit = fullString.length();

		System.out.println("    ");

		while (index < limit) {
			placeHolder = String.valueOf(fullString.charAt(index));
			temp = Integer.parseInt(placeHolder);

			if (temp == 0) {
				zeros ++;
				evens ++;
			} else if (temp % 2 == 0) {
				evens ++;
			} else {
				odds ++;
			}

			index ++;
		}
		
		System.out.println(value + " has " + zeros + " zero(s), " + evens +" even digit(s), and " + odds + " odd digit(s).");
		System.out.println("   ");
		System.out.println("Program closed");
		
	}
}
