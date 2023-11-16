package com.ramaselvathangamm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumOfThree {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int target = -nums[i];
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				int sum = nums[left] + nums[right];

				if (sum == target) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					while (left < right && nums[left] == nums[left + 1]) {
						left++;
					}

					while (left < right && nums[right] == nums[right - 1]) {
						right--;
					}

					left++;
					right--;
				} else if (sum < target) {
					left++;
				} else {
					right--;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of array : ");
		int length = scan.nextInt();
		int[] nums = new int[length];
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < length; i++) {
			nums[i] = scan.nextInt();
		}
		List<List<Integer>> res = threeSum(nums);
		for (List<Integer> li : res) {
			System.out.println(li);
		}
		scan.close();
	}

}
