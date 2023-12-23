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

	public static int minStepsWithMonster(char[][] plane) {
		int rows = plane.length;
		int cols = plane[0].length;
		int adventureX = -1, adventureY = -1;
		int goldX = -1, goldY = -1;
		int monsterX = -1, monsterY = -1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (plane[i][j] == 'A') {
					adventureX = i;
					adventureY = j;
				} else if (plane[i][j] == 'G') {
					goldX = i;
					goldY = j;
				} else if (plane[i][j] == 'M') {
					monsterX = i;
					monsterY = j;
				}
			}
		}

		if (adventureX == -1 || goldX == -1 || monsterX == -1) {
			return -1;
		}
		int adventurePath = Math.abs(adventureX - goldX) + Math.abs(adventureY - goldY);
		int monsterPath = Math.abs(monsterX - goldX) + Math.abs(monsterY - goldY);
		if (adventurePath > monsterPath) {
			return -1;
		}
		return adventurePath;

	}

	public static void main(String[] args) {
		char[][] plane = new char[5][4];
		plane[4][0] = 'A';
		plane[0][3] = 'G';
		int output1 = minSteps(plane);
		System.out.println("Minimum Number of Steps : " + output1);
		plane = new char[5][4];
		plane[4][0] = 'A';
		plane[3][2] = 'G';
		plane[2][0] = 'M';
		int output2 = minStepsWithMonster(plane);
		System.out.println(output2 > 0 ? ("Minimum Number of Steps : " + output2) : ("No Possible Solution"));
	}
}
