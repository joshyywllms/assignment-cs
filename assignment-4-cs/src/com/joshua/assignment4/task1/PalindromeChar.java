package com.joshua.assignment4.task1;

public class PalindromeChar {
	/**
	 * @param input
	 * @return isPalindrome
	 */
	public static boolean testPalindrome(char[] input) {
		int midLength;

		// Even number of characters
		if (input.length % 2 == 0)
			midLength = input.length / 2;
		// Odd number of characters
		else
			midLength = (input.length - 1) / 2;

		int startPosition = 0;
		boolean isPalindrome = true;

		while (startPosition <= midLength - 1) {
			if (input[startPosition] != input[input.length - startPosition - 1]) {
				isPalindrome = false;
				break;
			}
			startPosition += 1;
		}

		return isPalindrome;
	}
}
