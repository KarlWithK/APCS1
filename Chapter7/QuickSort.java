public class QuickSort {
	public static void main(String[] args) {
		int[] list = {5, 10, 1, 7, 8};	
		quickSort(list, 0, list.length - 1);
		for (int num : list)
			System.out.println(num);
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = arr[high];
			int index = low;
			int placeholder = 0;

			for (int j = low; j < high; j++) {
				if (arr[j] < pivot) {
					placeholder = arr[index]; 
					arr[index] = arr[j];
					arr[j] = placeholder;
					index++;
				}
			}

			placeholder = arr[index];
			arr[index] = arr[high];
			arr[high] = placeholder;
			quickSort(arr, low, index - 1);
			quickSort(arr, index + 1, high);
		}
	}
}
