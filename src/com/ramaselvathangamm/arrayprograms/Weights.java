package com.ramaselvathangamm.arrayprograms;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Weights {
	public static Map<Integer, Integer> sumOfWeights(int[] nums) {
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			if (isPerfectSquare(nums[i])) {
				sum += 5;
			}
			if (nums[i] % 4 == 0 && nums[i] % 6 == 0) {
				sum += 4;
			}
			if (nums[i] % 2 == 0) {
				sum += 3;
			}
			result.put(nums[i], sum);
		}
		return result;
	}

	public static boolean isPerfectSquare(int num) {
		if (num < 0) {
			return false;
		}
		int sqrt = (int) Math.sqrt(num);
		return sqrt * sqrt == num;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int length = scanner.nextInt();
		int[] arr = new int[length];

		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}

		Map<Integer, Integer> res = sumOfWeights(arr);
		System.out.println(res);

		scanner.close();
	}

}
