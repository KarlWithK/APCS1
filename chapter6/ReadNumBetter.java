import cs1.Keyboard;

public class ReadNumBetter {
	public static void main(String[] args) {
		int[] nums = new int[51];
		int Reads;
		System.out.println("Input a number from -25 to 25, and input 26 to stop");
		Reads = Keyboard.readInt();
		while (Reads != 26) {
			if (Reads > 25 || Reads < -25) {
				System.out.println("Input a correct num");
				Reads = Keyboard.readInt();
			}
			else
				nums[Reads + 25]++;
			System.out.println("Pick more, 26 to stop");
			Reads = Keyboard.readInt();
		}
		
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != 0)
				System.out.println((index - 25) + " : " + nums[index]);
		}
	}		
}
