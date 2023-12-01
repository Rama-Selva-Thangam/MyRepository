package com.ramaselvathangamm.leetcode;

public class MinCostClimbing {
	public static int minCostClimbingStairs(int[] cost) {
		for (int i = cost.length - 3; i >= 0; i--) {
			cost[i] += Math.min(cost[i + 1], cost[i + 2]);
		}
		return Math.min(cost[1], cost[0]);
	}

	public static void main(String[] args) {
		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int result = minCostClimbingStairs(cost);
		System.out.println(result);
	}

}
