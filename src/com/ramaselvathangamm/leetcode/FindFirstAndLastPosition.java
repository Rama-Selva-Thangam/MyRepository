package com.ramaselvathangamm.leetcode;

import java.util.Arrays;

public class FindFirstAndLastPosition {
	public static int[] searchRange(int[] nums, int target) {
		int[] res = new int[2];
		res[0] = findStartPos(nums, target);
		res[1] = findEndPos(nums, target);
		return res;
	}

	private static int findStartPos(int[] nums, int target) {
		int low = 0, high = nums.length - 1, res = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				res = mid;
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return res;
	}

	private static int findEndPos(int[] nums, int target) {
		int low = 0, high = nums.length - 1, res = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				res = mid;
				low = mid + 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] result = searchRange(nums, target);
		System.out.println(Arrays.toString(result));
	}
}
