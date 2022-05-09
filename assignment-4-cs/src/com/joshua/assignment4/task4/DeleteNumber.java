package com.joshua.assignment4.task4;

public class DeleteNumber {
	/**
	 * @param a
	 * @param element
	 * @return newArray
	 */
	public static int[] deleteElement(int[] a, int element) {
		boolean numberFound = false;
		int[] newArray;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == element) {
				numberFound = true;
				break;
			}
		}

		if (numberFound) {
			newArray = new int[a.length - 1];
			int currentIndex = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != element) {
					newArray[currentIndex] = a[i];
					currentIndex++;
				}
			}
		} else
			newArray = a;

		return newArray;
	}
}
