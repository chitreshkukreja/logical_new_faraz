package com.day1.exp;

public class FinMaxOf3 {

	static int[] xyz = new int[3];

	public static void main(String[] args) {
		xyz[0] = 1;
		xyz[1] = 4;
		xyz[2] = 5;
		int max = 0;
		for (int i = 0; i < xyz.length; i++) {
			//max = Math.max(max, xyz[i]);

			if (xyz[i] > max) {
				max = xyz[i];
			}
		}
		System.out.println(max);

	}

}