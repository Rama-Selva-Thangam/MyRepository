package com.ramaselvathangamm.maheshsan;

public class MaximumGap {
	public static int maximumGap(int[] nums) {
		int maxGap = 0;
		sort(nums);
		for (int i = 1; i < nums.length; i++) {
			int diff = nums[i] - nums[i - 1];
			maxGap = maxGap > diff ? maxGap : diff;
		}
		return maxGap;
	}

	static void sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 9, 1, 2, 3 };
		int res = maximumGap(nums);
		System.out.println(res);
	}

}
