//********************************************************************
// Sorts.java
//Author: Lewis/Loftus
//
// Demonstrates the selection sort and insertion sort algorithms,
// as well as a generic object sort.
//********************************************************************
public class Sorts
{
	//-----------------------------------------------------------------
	// Sorts the specified array of integers using the selection
	// sort algorithm.
	//-----------------------------------------------------------------
	public static void selectionSort (int[] numbers)
	{
		int max, temp;
		for (int index = 0; index < numbers.length-1; index++)
		{
			max = index;
			for (int scan = index+1; scan < numbers.length; scan++)
				if (numbers[scan] > numbers[max])
					max = scan;
			// Swap the values
			temp = numbers[max];
			numbers[max] = numbers[index];
			numbers[index] = temp;
		}
	}
	//-----------------------------------------------------------------
	// Sorts the specified array of integers using the insertion
	// sort algorithm.
	//
	public static void insertionSort (int[] numbers)
	{
		for (int index = 1; index < numbers.length; index++) {
			int key = numbers[index];
			int position = index;
			// shift larger values to the right
			while (position > 0 && numbers[position-1] < key) {
				numbers[position] = numbers[position-1];
				position--;
			}
			numbers[position] = key;
		}

	}
	//-----------------------------------------------------------------
	// Sorts the specified array of objects using the insertion
	// sort algorithm.
	//-----------------------------------------------------------------
	public static void insertionSort (Comparable[] objects)
	{
		for (int index = 1; index < objects.length; index++)
		{
			Comparable key = objects[index];
			int position = index;
			// shift larger values to the right
			while (position > 0 && objects[position-1].compareTo(key) < 0)
			{
				objects[position] = objects[position-1];
				position--;
			}
			objects[position] = key;
		}
	}
}
