package com.ramaselvathangamm.todaypractice;

import java.util.Arrays;
import java.util.Scanner;

public class PairitySort {
	public static int[] sortArrayByParity(int[] nums) {
		int n = nums.length;
		int even = 0, odd = n - 1;

		while (even < odd) {
			if (nums[even] % 2 == 0)
				even++;
			else if (nums[odd] % 2 == 1)
				odd--;
			else {
				int temp = nums[even];
				nums[even] = nums[odd];
				nums[odd] = temp;
			}
		}
		return nums;
	}

	public static int[] sortArrayByParity2(int[] nums) {
		int[] result = new int[nums.length];
		int evenIndex = 0;
		int oddIndex = nums.length - 1;

		for (int num : nums) {
			if (num % 2 == 0) {
				result[evenIndex++] = num;
			} else {
				result[oddIndex--] = num;
			}
		}

		return result;
	}

	public static int[] sortArrayByParityRecursion(int[] nums) {
		return sortArrayByParityRec(nums, 0, nums.length - 1);
	}

	private static int[] sortArrayByParityRec(int[] nums, int even, int odd) {
		if (even >= odd) {
			return nums;
		}

		if (nums[even] % 2 != 0) {
			int temp = nums[even];
			nums[even] = nums[odd];
			nums[odd] = temp;
			return sortArrayByParityRec(nums, even, odd - 1);
		}
		return sortArrayByParityRec(nums, even + 1, odd);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of array : ");
		int length = scan.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}
		int[] res = sortArrayByParityRecursion(arr);
		System.out.println(Arrays.toString(res));
		scan.close();

	}

}
