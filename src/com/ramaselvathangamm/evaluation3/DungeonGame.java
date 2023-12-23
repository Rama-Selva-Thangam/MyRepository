package com.ramaselvathangamm.evaluation3;

import java.util.ArrayList;
import java.util.List;

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

	public static List<List<Integer>> minStepPath(char[][] plane, char adventure, char gold, char monster) {
		int steps = minStepsWithMonster(plane, adventure, gold, monster);
		if (steps < 0) {
			return null;
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		int adventureX = -1, adventureY = -1;
		int goldX = -1, goldY = -1;
		for (int i = 0; i < plane.length; i++) {
			for (int j = 0; j < plane[i].length; j++) {
				if (plane[i][j] == adventure) {
					adventureX = i + 1;
					adventureY = j + 1;
				} else if (plane[i][j] == gold) {
					goldX = i + 1;
					goldY = j + 1;
				}
			}
		}

		if (adventureX == -1) {
			return null;
		}
		path.add(adventureX);
		path.add(adventureY);
		result.add(new ArrayList<Integer>(path));
		while (adventureX != goldX || adventureY != goldY) {
			if (adventureX < goldX) {
				adventureX++;
			} else if (adventureX > goldX) {
				adventureX--;
			} else if (adventureY < goldY) {
				adventureY++;
			} else if (adventureY > goldY) {
				adventureY--;
			}
			path.clear();
			path.add(adventureX);
			path.add(adventureY);
			result.add(new ArrayList<Integer>(path));
		}

		return result;
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
		System.out.println(output2 >= 0 ? ("Minimum Number of Steps : " + output2) : ("No Possible Solution"));
		List<List<Integer>> output3 = minStepPath(plane, 'A', 'G', 'M');
		if (output3 != null) {
			System.out.println("Minimum Number of Steps : " + (output3.size() - 1));
			int i = 0;
			for (List<Integer> li : output3) {
				i++;
				System.out.print(li);
				if (i < output3.size()) {
					System.out.print("-->");
				}
			}
		}
	}
}
