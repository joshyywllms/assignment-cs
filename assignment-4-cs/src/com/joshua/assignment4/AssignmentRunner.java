package com.joshua.assignment4;

import com.joshua.assignment4.task1.PalindromeChar;
import com.joshua.assignment4.task2.BubbleSort;
import com.joshua.assignment4.task3.MedianValue;
import com.joshua.assignment4.task4.DeleteNumber;
import com.joshua.assignment4.task5.SoccerMatchesExtended;

public class AssignmentRunner {

	public static void main(String[] args) {
		/*
		 * Task 1
		 */
		char[] input1 = { 'm', 'a', 'd', 'a', 'm' };
		char[] input2 = { 'a', 'n', 'n', 'a' };
		char[] input3 = { 'j', 'o', 's', 'h', 'u', 'a' };

		System.out.println("The given word is Palindrome: " + PalindromeChar.testPalindrome(input1));
		System.out.println("The given word is Palindrome: " + PalindromeChar.testPalindrome(input2));
		System.out.println("The given word is Palindrome: " + PalindromeChar.testPalindrome(input3));

		/*
		 * Task 2
		 */
		int[] task2input1 = { 1, 7, 4, 2, 8, 3 };
		int[] sortedArray = BubbleSort.bubbleSort(task2input1);

		System.out.println("The sorted array is: ");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i]);
		}

		System.out.println();

		/*
		 * Task 3
		 */
		int[] task3input1 = { 1, 2, 3 };
		int[] task3input2 = { 1, 2, 3, 4 };

		System.out.println("The median value is: " + MedianValue.getMedian(task3input1));
		System.out.println("The median value is: " + MedianValue.getMedian(task3input2));

		/*
		 * Task 4
		 */
		int[] task4input1 = { 1, 2, 3, 4 };
		int[] newArray = DeleteNumber.deleteElement(task4input1, 3);

		System.out.println("The new array is: ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]);
		}

		System.out.println();

		/*
		 * Task3-Scenario 1
		 */

		int home = 1;
		int guest = 1;
		int homeBet = 1;
		int guestBet = 0;

		int[][] task5input1 = new int[2][2];
		task5input1[0][0] = home;
		task5input1[0][1] = guest;
		task5input1[1][0] = homeBet;
		task5input1[1][1] = guestBet;

		System.out.println("Result: " + home + ":" + guest + " bet: " + homeBet + ":" + guestBet + " points scored: "
				+ SoccerMatchesExtended.soccerBets(task5input1));

	}

}
