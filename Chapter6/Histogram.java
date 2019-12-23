import cs1.Keyboard;

public class Histogram {
	public static void main(String[] args) {
		System.out.println("Please input a num between 1 and 100, input -1 to end");
		int readInt = Keyboard.readInt();
		int[] nums = new int[10];
		while (readInt != -1) {
			if (readInt > 100 || readInt < 1) {
				System.out.println("Invalid input. Please input a num between 1 and 100");
				readInt = Keyboard.readInt();
			}
			int index = 0;
			for (int check = 10; check < readInt && check != readInt; check += 10)
				index++;
			nums[index]++;
			System.out.println("input more nums, -1 to end");
			readInt = Keyboard.readInt();
		}

		for (int printLine = 0; printLine < nums.length; printLine++) {
			int min = printLine * 10 + 1;
			int max = printLine * 10 + 10;
			System.out.print(min + " - " + max + "   \t|   ");
			for (int stars = 0; stars < nums[printLine]; stars++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
