package com.ramaselvathangamm.rajeesan;

/*
	Return the Array of product of All the elements except itself.
	Example : Input arr = {1,2,3,4}
			  Output arr = {24,12,8,6}
 */

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArray {

	public static void findProduct(int[] nums) {
		int len = nums.length;
		int product = 1;
		for (int i = 0; i < len; i++) {
			product *= nums[i];
		}
		for (int i = 0; i < len; i++) {
			nums[i] = product / nums[i];
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length of Array: ");
		int len = scan.nextInt();
		int[] nums = new int[len];
		System.out.println("Enter the Elements: ");
		for (int i = 0; i < len; i++) {
			nums[i] = scan.nextInt();
		}

		findProduct(nums);

		System.out.println("Output Array: " + Arrays.toString(nums));
	}
}
