public class SortGrades {
	public static void main(String[] args) {
		int[] grades = {1,2,4,5,21,10,14};
		int[] grades1 = {1,2,4,5,6,21,10,14};
		Sorts.selectionSort(grades);
		for (int S : grades)
			System.out.print(S + " ");
		Sorts.insertionSort(grades1);
		System.out.println();
		for (int S : grades1)
			System.out.print(S + " ");

	}
}
