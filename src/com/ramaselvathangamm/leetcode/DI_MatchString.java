package com.ramaselvathangamm.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class DI_MatchString {
	public static int[] diStringMatch(String s) {
		int low = 0;
		int high = s.length();
		int ans[] = new int[s.length() + 1];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				ans[i] = low;
				low++;
			} else {
				ans[i] = high;
				high--;
			}
		}
		ans[s.length()] = high;
		return ans;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		int[] res = diStringMatch(word);
		System.out.println(Arrays.toString(res));
		scan.close();
	}

}
