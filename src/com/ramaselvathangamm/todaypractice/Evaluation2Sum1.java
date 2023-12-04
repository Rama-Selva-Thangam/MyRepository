package com.ramaselvathangamm.todaypractice;

import java.util.Arrays;

public class Evaluation2Sum1 {
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

	public static int[] findMaximumSubarray1(int[] nums) {
		int left = 0, right = nums.length - 1;
		int from = 0, to = 0, sum = 0, max = 0;
		for (int i : nums) {
			sum += i;
		}
		while (left < right) {
			if (nums[left] < nums[right]) {
				sum -= nums[left];
				left++;
			} else {
				sum -= nums[right];
				right--;
			}
			if (sum > max) {
				max = sum;
				from = left;
				to = right;
			}
		}
		return getArray(nums, from, to);
	}

	private static int[] getArray(int[] numbers, int from, int to) {
		int[] result = new int[to - from + 1];
		for (int i = 0; i < result.length; i++) {
			result[i] = numbers[i + from];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] maxSubarray = findMaximumSubarray(nums);
		System.out.println(Arrays.toString(maxSubarray));
	}
}
