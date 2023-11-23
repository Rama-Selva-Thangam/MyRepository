package com.ramaselvathangamm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubArrays {
	public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
		List<Boolean> result = new ArrayList<Boolean>();
		for (int i = 0; i < l.length; i++) {
			boolean value = checkSubArray(Arrays.copyOfRange(nums, l[i], r[i] + 1));
			result.add(value);
		}

		return result;

	}

	public static boolean checkSubArray(int[] arr) {
		Arrays.sort(arr);
		for (int i = 1; i < arr.length - 1; i++) {
			if ((arr[i] - arr[i - 1]) != (arr[i + 1] - arr[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums1 = { 4, 6, 5, 9, 3, 7 }, l1 = { 0, 0, 2 }, r1 = { 2, 3, 5 };
		List<Boolean> res1 = checkArithmeticSubarrays(nums1, l1, r1);
		int[] nums2 = { -12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10 }, l2 = { 0, 1, 6, 4, 8, 7 },
				r2 = { 4, 4, 9, 7, 9, 10 };
		List<Boolean> res2 = checkArithmeticSubarrays(nums2, l2, r2);
		System.out.println(res1);
		System.out.println(res2);

	}

}
