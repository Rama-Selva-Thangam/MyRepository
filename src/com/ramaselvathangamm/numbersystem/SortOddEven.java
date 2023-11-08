package com.ramaselvathangamm.numbersystem;

import java.util.Arrays;
import java.util.Scanner;

public class SortOddEven {
	public static int[] sortEvenOdd(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (i % 2 == 0 && nums[i] > nums[j]) {
					swap(i, j, nums);
				} else if (i % 2 != 0 && nums[i] < nums[j]) {
					swap(i, j, nums);
				}
			}
		}

		return nums;
	}

	public static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int length = scan.nextInt();
		int[] nums = new int[length];
		for (int i = 0; i < length; i++) {
			nums[i] = scan.nextInt();
		}
		int[] res = sortEvenOdd(nums);
		System.out.println(Arrays.toString(res));

		scan.close();
	}
}
