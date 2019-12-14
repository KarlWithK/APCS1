public class ExercisesTwo {
	public static void main (String[] args) {
		System.out.println(countA("Two AAs"));
		System.out.println(evenlyDivisible(10, 6));
		System.out.println(average(7, 6));
		System.out.println(average(7, 6, 5));
		System.out.println(average(7, 6, 5, 10));
		System.out.println(multiConcat("Cat", 5));
	}

	public static int countA (String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 'A')
				count++;
		}
		return count;
	}

	public static boolean evenlyDivisible (int num1, int num2) {
		return num1 % num2 == 0 || num2 % num1 == 0;
	}

	public static double average (int num1, int num2) {
		return (num1 + num2) / (double) 2; 
	}

	public static double average (int num1, int num2, int num3) {
		return (num1 + num2 + num3) / (double) 3;
	}

	public static double average (int num1, int num2, int num3, int num4) {
		return (num1 + num2 + num3 + num4) / (double) 4;
	}
	
	public static String multiConcat(String str, int repeatTimes) {
		String result = "";
		if (repeatTimes < 2)
			return str;
		for (int times = 0; times < repeatTimes; times ++) {
			result += str;
		}
		return result;
	}
}
