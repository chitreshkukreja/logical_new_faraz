package com.day1.exp;

public class PerfectPowerOf2 {

	static int[] arr = new int[6];

	public static void main(String[] args) {
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 8;
		arr[4] = 16;
		arr[5] = 5;
		for (int i = 0; i < arr.length; i++) {

			// get data and check
			int num = arr[i];
			int pow2 = 2;

			while (num >= pow2) {

				if (num == pow2) {
					System.out.println(num + " number is powe of 2...");
					break;
				}
				if (num % pow2 == 0) {
					pow2 *= 2;

				} else {
					System.out.println(num + " number is not powe of 2 ------ ");
					break;
				}
//				if (num == pow2) {
//					System.out.println(num + " number is powe of 2...");
//					break;
//				}
			}
			if (num < pow2) {
				System.out.println(num + " number is not powe of 2$$$$$");
			}
		}

	}

}
