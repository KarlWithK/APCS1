public class ExercisesThree {
	public static void main(String[] args) {
		System.out.println(MultiConcat("what"));			
		System.out.println(isAplha('w'));
		System.out.println(isAplha('*'));
		System.out.println(floatEquals(0.00001, 0.00001, 0.0001));	
		System.out.println(reverse("What"));
		System.out.println(isIsoceles(3, 4, 5));
		System.out.println(isIsoceles(5, 5, 6));	
		System.out.println(isIsoceles(1, 2, 3));	
		System.out.println(randomInRange(5, 10));	
	}	

	
	public static String MultiConcat(String str) {
		return str + str;
	}

	public static boolean isAplha(char character) {
		return (character < 123 && character > 96 || character < 91 && character > 64);
	}	
	
	public static boolean floatEquals(double num1, double num2, double limit) {
		return Math.abs(num1 - num2) <= limit;
	}

	public static String reverse(String str) {
		String result = "";	
		for (int backIndex = str.length() - 1; backIndex > -1; backIndex--) {
			result += str.charAt(backIndex);
		}
		return result;		
	}	

	public static boolean isIsoceles(int side1, int side2, int side3) {
		if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2)
			return false;
		if (side1 == side2 && side2 == side3)
			return false;
		return side1 == side2 || side2 == side3 || side1 == side3;
	}	
	
	public static int randomInRange(int min, int limit) {
		if (min > limit) 
			return 0;
		return (int) (Math.random() * (limit - min + 1)) + min;
	} 
	
}
