import cs1.Keyboard;

public class ReadNum {
	public static void main(String[] args) {
		int[] nums = new int[51];
		int Reads;
		System.out.println("Input a number from 0 to 50, and input -1 to stop");
		Reads = Keyboard.readInt();
		while (Reads != -1) {
			if (Reads > 50 || Reads < 0) {
				System.out.println("Input a correct num");
				Reads = Keyboard.readInt();
			}
			else
				nums[Reads]++;
			System.out.println("Pick more, -1 to stop");
			Reads = Keyboard.readInt();
		}
		
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != 0)
				System.out.println(index + " : " + nums[index]);
		}
	}		
}
