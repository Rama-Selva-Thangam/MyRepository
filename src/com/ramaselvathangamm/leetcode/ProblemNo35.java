package com.ramaselvathangamm.leetcode;

public class ProblemNo35 {
    public static int searchInsert(int[] nums, int target) {
    	int index = -1;
    	for(int i=1;i<nums.length;i++) {
    		if(target>=nums[i] && target<=nums.length) {
    			return i;
    		}
    	}
        return index;
    }

	public static void main(String[] args) {
		

	}

}
