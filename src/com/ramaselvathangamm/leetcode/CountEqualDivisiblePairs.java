package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class CountEqualDivisiblePairs {
	public static int countPairs(int[] nums, int k) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && (nums[i] + nums[j]) % k == 0) {
					result++;
					break;
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int length = scan.nextInt();
		int[] nums = new int[length];
		for (int i = 0; i < length; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.print("Enter the K value : ");
		int k = scan.nextInt();
		int result = countPairs(nums, k);
		System.out.println(result);
		scan.close();
	}

}
