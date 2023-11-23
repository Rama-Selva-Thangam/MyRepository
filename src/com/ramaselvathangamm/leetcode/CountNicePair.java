package com.ramaselvathangamm.leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class CountNicePair {
	public static int countNicePairs(int[] nums) {
		int MOD = 1000000007;
		int count = 0;
		HashMap<Long, Integer> freqMap = new HashMap<>();

		for (int num : nums) {
			long revNum = rev(num);
			long diff = (long) num - revNum;

			freqMap.put(diff, freqMap.getOrDefault(diff, 0) + 1);
		}

		for (long key : freqMap.keySet()) {
			int freq = freqMap.get(key);
			if (freq > 1) {
				count = (int) ((count + ((long) freq * (freq - 1) / 2)) % MOD);
			}
		}

		return count;
	}

	public static int rev(int n) {
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		return Integer.parseInt(sb.reverse().toString());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int len = scan.nextInt();
		int[] nums = new int[len];
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		int count = countNicePairs(nums);
		System.out.println(count);
		scan.close();

	}

}
