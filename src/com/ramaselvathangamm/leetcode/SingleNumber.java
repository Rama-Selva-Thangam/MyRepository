package com.ramaselvathangamm.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {
	public static int[] singleNumber(int[] nums) {
		int[] res = new int[2];
		boolean[] flag = new boolean[nums.length];
		for (int i = 0; i < nums.length; i++) {
			
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int len = scan.nextInt();
		int[] nums = new int[len];
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < len; i++)
			nums[i] = scan.nextInt();
		int[] res = singleNumber(nums);
		System.out.println(Arrays.toString(res));
		scan.close();
	}

}
