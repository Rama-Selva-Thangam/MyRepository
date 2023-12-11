package com.ramaselvathangamm.leetcode;

public class ElementAppearingMoreThan25Percent {
	public static int findSpecialInteger(int[] arr) {
		int n = arr.length;
		int quarter = n / 4;

		for (int i = 0; i < n - quarter; i++) {
			if (arr[i] == arr[i + quarter]) {
				return arr[i];
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 6, 6, 6, 6, 7, 8 };
		int result = findSpecialInteger(nums);
		System.out.println(result);
	}

}
