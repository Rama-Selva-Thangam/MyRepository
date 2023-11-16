package com.ramaselvathangamm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber_2 {
	public static int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) {
                return entry.getKey();
            }
        }
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length of Array : ");
		int length = scan.nextInt();
		int[] nums = new int[length];
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		int result = singleNumber(nums);
		System.out.println(result);
		scan.close();

	}

}
