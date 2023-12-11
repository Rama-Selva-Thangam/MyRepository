package com.ramaselvathangamm.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class SimplifyPath {
	public static String simplifyPath(String path) {

		Stack<String> st = new Stack<String>();
		String[] arr = new String[path.length()];
		for (String dirOrfile : path.split("/")) {
			if (!dirOrfile.isEmpty() && dirOrfile.equals("..")) {
				if (!st.isEmpty()) {
					st.pop();
				}

			} else if (!dirOrfile.equals("..") && !dirOrfile.equals(".") && !dirOrfile.equals("")) {
				st.push(dirOrfile);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (String s : st) {
			sb.append("/").append(s);
		}
		return sb.length() == 0 ? "/" : sb.toString();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the  Path  : ");
		String path = scan.nextLine();
		String result = simplifyPath(path);
		System.out.println(result);
	}

}
