public class QuickSort {
	public static void main(String[] args) {
		// int[] list = {5, 10, 1, 7, 8};	
		int[] list = {3, 0, 1, 8, 7, 2, 5, 4, 9, 6};
		quickSortLo(list, 0, list.length - 1);
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

	public static void quickSortLo(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = arr[low];
			int index = high;
			int placeholder = 0;

			for (int j = high; j > low; j--) {
				if (arr[j] > pivot) {
					placeholder = arr[index]; 
					arr[index] = arr[j];
					arr[j] = placeholder;
					index--;
				}
			}

			placeholder = arr[index];
			arr[index] = arr[low];
			arr[low] = placeholder;
			quickSortLo(arr, low, index - 1);
			quickSortLo(arr, index + 1, high);
		}
	}
	
}
