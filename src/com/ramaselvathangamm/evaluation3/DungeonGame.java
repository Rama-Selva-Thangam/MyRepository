package com.ramaselvathangamm.evaluation3;

public class DungeonGame {
	public static int minSteps(char[][] plane, char adventure, char gold) {
		int rows = plane.length;
		int cols = plane[0].length;
		int adventureX = -1, adventureY = -1;
		int goldX = -1, goldY = -1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (plane[i][j] == adventure) {
					adventureX = i;
					adventureY = j;
				} else if (plane[i][j] == gold) {
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

	public static int minStepsWithMonster(char[][] plane, char adventure, char gold, char monster) {
		int adventureStep = minSteps(plane, 'A', 'G');
		int monsterStep = minSteps(plane, 'M', 'G');
		if (adventureStep > monsterStep) {
			return -1;
		}
		return adventureStep;
	}

	public static void main(String[] args) {
		char[][] plane = new char[5][4];
		plane[4][0] = 'A';
		plane[0][3] = 'G';
		int output1 = minSteps(plane, 'A', 'G');
		System.out.println("Minimum Number of Steps : " + output1);
		plane = new char[5][4];
		plane[4][0] = 'A';
		plane[3][2] = 'G';
		plane[2][0] = 'M';
		int output2 = minStepsWithMonster(plane, 'A', 'G', 'M');
		System.out.println(output2 > 0 ? ("Minimum Number of Steps : " + output2) : ("No Possible Solution"));
	}
}
