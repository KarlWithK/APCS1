import cs1.Keyboard;

public class BinaryConvert {
	public static void main (String[] args) {
		
		int num;
		String finalConvert = "";
		System.out.println ("State the number in decimal format you wish to convert to binary");
		num = Keyboard.readInt();
		
		while (num > 0) {
			finalConvert += num % 2 == 1 ? "1" : "0";
			num /= 2;
		} System.out.println("In binary that number is: " + finalConvert);
	}
}
