//Name: Carlos "Karl" Hernandez
//HW for 11.1.19 4.1-6

public class Exercises {
	public static void main (String[] args) {
		powersOfTwo();
		alarm(10);
		System.out.println(sum100());
		System.out.println(maxOfTwo(100, 2));
		System.out.println(sumRange(1, 100));
		System.out.println(sumRange(100, 1));
		System.out.println(larger(0.02, 0.01));

	}

	public static void powersOfTwo() {
		int currentPower = 2;
		for (int startNum = 2; startNum < Math.pow(2, 11); startNum = (int) Math.pow(2, currentPower++)) {
			System.out.println(startNum);
		} 
	}

	public static void alarm (int lineNum) {
		if (lineNum < 1) {
			System.out.println("You fool! Input a num greater than or equal to 1!");	
		} else {
			for (int currentLines = 0; currentLines < lineNum; currentLines++ ) {
				System.out.println("Alarm!");
			} 
		}
	}

	public static int sum100() {
		int sum = 0;
		for (int currentnum = 0; currentnum < 101; currentnum++) {
			sum += currentnum;
		}
		return sum;
	}


	public static int maxOfTwo(int num1, int num2) {
		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int sumRange(int min, int limit) {
		if (limit < min) {
			System.out.println("Fool! The limit is smaller then the first num.");
			return 0;
		} else {
			int sum = 0;
			for (int startNum = min; startNum <= limit; startNum++) {
				sum += startNum;
			}
			return sum;
		}
	}

	public static boolean larger (double num1, double num2) {
		return num1 > num2;
	}
}

