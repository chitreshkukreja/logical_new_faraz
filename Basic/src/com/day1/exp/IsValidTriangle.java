package com.day1.exp;

public class IsValidTriangle {

	public static void main(String[] args) {
		System.out.println(checkIfTrangleIsValid(50, 50, 80));

	}

	public static String checkIfTrangleIsValid(int a, int b, int c) {

		if ((a + b + c) == 180) {
			return "Triangle is valid";
		} else {
			return "triangle is not valid";
		}

	}
}
