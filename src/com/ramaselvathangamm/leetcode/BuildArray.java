package com.ramaselvathangamm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BuildArray {
	 public static List<String> buildArray(int[] target, int n) {
	        List<String> res=new ArrayList<String>();
	        int index=0;
	        for(int i=1;index<target.length;i++){
	            if(i==target[index]){
	                res.add("Push");
	                index++;
	            }
	            else{
	                res.add("Push");
	                res.add("Pop");
	            }
	        }
	        return res;
	    }

	public static void main(String[] args) {
		int[] target= {1,8};
		int n=6;
		List<String> res=buildArray(target,n);
		System.out.println(res);

	}

}
