public class RadixSort {
	// not finished at all
	public static void main (String[] args) {
		
	}

	public static void radixSort(int[] arr) {
		int[] digits = new int[10];
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max)
				max = arr[index];
		}

		for (int len = 1; len < max; len *= 10) {
			for (int index = 0; index < arr.length; index++) {
				digits[arr[index] / len % 10]++;
			}

		}
		
	}

}
