package com.joshua.assignment4.task3;

public class MedianValue {
	/**
	 * @param array
	 * @return double
	 */
	public static double getMedian(int[] array) {
		if (array == null || array.length == 0)
			return 0;
		else if (array.length % 2 == 0)
			return (double) (array[(array.length / 2) - 1] + array[array.length / 2]) / 2.0F;
		else
			return (double) (array[(array.length - 1) / 2]);
	}
}
