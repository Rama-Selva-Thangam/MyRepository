package com.ramaselvathangamm.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElementsWithGCE {
	public static int[] replaceElements(int[] arr) {
		int max = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = max;
			max = Math.max(max, temp);
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array: ");
		int length = scan.nextInt();
		int[] nums = new int[length];
		for (int i = 0; i < length; i++) {
			nums[i] = scan.nextInt();
		}
		int[] res = replaceElements(nums);
		System.out.println(Arrays.toString(res));

		scan.close();
	}
}
