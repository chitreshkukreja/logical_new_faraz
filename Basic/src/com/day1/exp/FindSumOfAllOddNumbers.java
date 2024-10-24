package com.day1.exp;

public class FindSumOfAllOddNumbers {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int sumOfOddNum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			if (arr[i] % 2 != 0) {
				sumOfOddNum += arr[i];
			}
		}
		System.out.println("Sum Of Odd Number is " + sumOfOddNum);

	}
}
