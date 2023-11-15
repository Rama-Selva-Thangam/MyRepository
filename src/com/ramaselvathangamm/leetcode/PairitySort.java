package com.ramaselvathangamm.leetcode;

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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of array : ");
		int length = scan.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}
		int[] res = sortArrayByParity(arr);
		System.out.println(Arrays.toString(res));
		scan.close();

	}

}
