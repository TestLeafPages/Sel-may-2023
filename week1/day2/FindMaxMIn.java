package week1.day2;

import java.util.Arrays;

public class FindMaxMIn {

	public static void main(String[] args) {

		int[] arr = { 12, 4, 67, 38, 96, 54 };

		Arrays.sort(arr);// F3 0r right click openDeclaration

		// 4,12,38,54,67,96

		int l = arr.length;

		System.out.println(arr[0]);
		System.out.println(arr[l - 1]);

	}

}
