package com.jan7.exp;

public class SumOfAllDigit {

	public static void main(String[] args) {

		getSumOfDigit(12);
	}

	public static void getSumOfDigit(int num) {

		int temp = num;
		int total = 0;
		while (temp != 0) {
			int currNum = temp % 10;
			temp = temp / 10;
			System.out.println(currNum);
			total += currNum;
		}
		System.out.println(total);
	}
}
