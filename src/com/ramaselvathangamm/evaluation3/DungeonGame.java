package com.ramaselvathangamm.evaluation3;

public class DungeonGame {
	public static int minSteps(char[][] plane) {
		int rows = plane.length;
		int cols = plane[0].length;
		int adventureX = -1, adventureY = -1;
		int goldX = -1, goldY = -1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (plane[i][j] == 'A') {
					adventureX = i;
					adventureY = j;
				} else if (plane[i][j] == 'G') {
					goldX = i;
					goldY = j;
				}
			}
		}

		if (adventureX == -1 || goldX == -1) {
			return -1;
		}
		return Math.abs(adventureX - goldX) + Math.abs(adventureY - goldY);
	}


	public static void main(String[] args) {
		char[][] plane = new char[5][4];
		plane[4][1] = 'A';
		plane[0][3] = 'G';
		int output1 = minSteps(plane);
		System.out.println("Minimum Number of Steps : " + output1);
	}



}
