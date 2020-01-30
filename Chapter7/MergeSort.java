public class MergeSort {
	public static void main(String[] args) {
		// int[] n1 = { 1, 4, 5, 10 };
		// int[] n2 = { 2, 6, 7, 8, 22};
		// for (int s : merge(n1, n2)) {
		// System.out.println(s);
		// }

		int[] n3 = { 4, 1, 1000, 3, 6, 8, 2, 7, 5, 9 };
		for (int num : mergeSort(n3))
			System.out.println(num);

	}

	public static int[] merge(int[] arrayLo, int[] arrayHi) {
		int[] mergeArray = new int[arrayLo.length + arrayHi.length];
		int indexLo = 0, indexHi = 0, index = 0;
		while (indexLo < arrayLo.length && indexHi < arrayHi.length) {
			if (arrayLo[indexLo] < arrayHi[indexHi]) {
				mergeArray[index] = arrayLo[indexLo];
				indexLo++;
			} else {
				mergeArray[index] = arrayHi[indexHi];
				indexHi++;
			}
			index++;
		}

		for (; index < mergeArray.length; index++) {
			if (indexHi != arrayHi.length) {
				mergeArray[index] = arrayHi[indexHi];
				indexHi++;
			} else {
				mergeArray[index] = arrayLo[indexLo];
				indexLo++;
			}
		}

		return mergeArray;
	}

	public static int[] mergeSort(int[] array) {
		if (array.length < 2)
			return array;
		else {
			int middle = array.length / 2, secondHalf = array.length - middle;
			int[] arrayLo = new int[middle];
			int[] arrayHi = new int[secondHalf];
			int indexLo = 0, indexHi = 0;
			for (int index = 0; index < array.length; index++) {
				if (index < middle) {
					arrayLo[indexLo] = array[index];
					indexLo++;
				} else {
					arrayHi[indexHi] = array[index];
					indexHi++;
				}
			}
			return merge(mergeSort(arrayLo), mergeSort(arrayHi));
		}
	}
}
