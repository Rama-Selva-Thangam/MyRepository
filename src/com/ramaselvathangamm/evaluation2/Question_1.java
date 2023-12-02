package com.ramaselvathangamm.evaluation2;

import java.util.Arrays;

public class Question_1 {
	public static int[] findMaximumSubarray(int[] nums) {
		int maxSum = Integer.MIN_VALUE, currentSum = 0, start = 0, end = 0, tempStart = 0;
		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			if (currentSum > maxSum) {
				maxSum = currentSum;
				start = tempStart;
				end = i;
			}
			if (currentSum < 0) {
				currentSum = 0;
				tempStart = i + 1;
			}
		}
		int[] result = new int[end - start + 1];
		int c = 0;
		for (int i = start; i <= end; i++) {
			result[c] = nums[i];
			c++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] maxSubarray = findMaximumSubarray(nums);
		System.out.println(Arrays.toString(maxSubarray));
	}
}
