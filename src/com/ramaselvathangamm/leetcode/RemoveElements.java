package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class RemoveElements {
	public static int removeElement(int[] nums, int val) {
		int res = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				int temp = nums[res];
				nums[res] = nums[j];
				nums[j] = temp;
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int len = scan.nextInt();
		int[] nums = new int[len];
		System.out.print("Enter the Elements : ");
		for (int i = 0; i < len; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.print("Enter the Value : ");
		int val = scan.nextInt();
		int result = removeElement(nums, val);
		System.out.println(result);
		scan.close();

	}

}
