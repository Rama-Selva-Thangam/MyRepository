package com.ramaselvathangamm.leetcode;

import java.util.Arrays;

public class ProblemNo27 {
	public static int removeElement(int[] nums, int val) {
		int k = 0;
		if (nums.length == 0) {
			return 0;
		}
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;

	}

	public static void main(String[] args) {
		int[] nums = {3, 2, 2, 3};
		int val = 3;
		int k = removeElement(nums, val);
		System.out.println("The new length of the array is: " + k);
		System.out.print("The modified array is: ");
		System.out.print(Arrays.toString(nums));
	}

}
