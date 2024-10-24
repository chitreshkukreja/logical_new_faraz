package com.day1.exp;

public class CheckLeapYear {

	public static void main(String[] args) {
		isLeapYear(2024);

	}

	public static void isLeapYear(int year) {

		if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println(year + " Is a leap year");
		} else {
			System.out.println(year + " Is not a leap year");
		}
	}
}
