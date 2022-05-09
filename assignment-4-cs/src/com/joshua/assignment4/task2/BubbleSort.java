package com.joshua.assignment4.task2;

public class BubbleSort {
	/**
	 * @param array
	 * @return array
	 */
	public static int[] bubbleSort(int[] array) {
		// Outer sort --> Last one is fugile, can be run till array.length - 2
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1])
					swap(j, array);
			}
		}

		return array;
	}

	private static void swap(int index, int[] array) {
		// Swaps values at 'index' AND 'index + 1'
		int temp = array[index];
		array[index] = array[index + 1];
		array[index + 1] = temp;
	}
}
