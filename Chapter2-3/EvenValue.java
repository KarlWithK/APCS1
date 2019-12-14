import cs1.Keyboard;

public class EvenValue {
	public static void main(String[] args) {
		int value, count = 1, sum = 0;

		System.out.println("Please state a number greator then 2 that you would like to see the sum of all even integers between it and 2");

		value = Keyboard.readInt();

		if (value < 2) {
			System.out.println("In order for this program to work we need a number that is greator than two. Please pick a positive int greater than two.");
			System.out.println("    ");
			value = Keyboard.readInt();
		}

		while (count <= value) {
			if (count % 2 == 0) {
				sum += count; 
			}

			count ++;
		}
		
		System.out.println("    ");
		System.out.println("The sum of all even integers between 2 and " + value + " is " + sum);
	}
}
