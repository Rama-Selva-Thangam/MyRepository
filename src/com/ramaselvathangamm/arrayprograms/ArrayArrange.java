package com.ramaselvathangamm.arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayArrange {
	public static void rearrangeArray(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (i % 2 == 0) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] > nums[j]) {
						swapPosition(nums, i, j);
					}
				}
			} else {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] < nums[j]) {
						swapPosition(nums, i, j);
					}
				}
			}
		}
	}

	public static void swapPosition(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int length = scan.nextInt();
		int[] nums = new int[length];
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < length; i++)
			nums[i] = scan.nextInt();
		rearrangeArray(nums);
		System.out.println( Arrays.toString(nums));
		scan.close();
	}
}
