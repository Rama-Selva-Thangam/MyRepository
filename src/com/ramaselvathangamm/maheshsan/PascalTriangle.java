package com.ramaselvathangamm.maheshsan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
	public static List<List<Integer>> pascalTriangle(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; i++) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					row.add(pre.get(j - 1) + pre.get(j));
				}
			}
			pre = row;
			list.add(row);
		}
		return list;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Rows : ");
		int rows = scan.nextInt();
		List<List<Integer>> result = pascalTriangle(rows);
		for (List<Integer> li : result) {
			System.out.println(li);
		}
	}

}
