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

	public static int minStepsWithMonster(char[][] plane, char adventure, char gold) {
		int adventureStep = minSteps(plane, adventure, gold);
		int monsterStep = minSteps(plane, 'M', gold);
		if (adventureStep > monsterStep) {
			return -1;
		}
		return adventureStep;
	}

	public static List<List<Integer>> minStepPath(char[][] plane, char adventure, char gold) {
		int steps = minStepsWithMonster(plane, adventure, gold);
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

	public static int minStepwithTrigger(char[][] plane, char adventure, char gold) {
		int adventureStep = minSteps(plane, adventure, gold);
		int monsterStep = minSteps(plane, 'M', gold);

		if (adventureStep > monsterStep) {
			adventureStep += minSteps(plane, gold, 'T') - 1;
		}
		return adventureStep;
	}

	public static int minStepsWithPits(char[][] plane, char adventure, char gold) {
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
		int steps = 0;
		while (adventureX != goldX || adventureY != goldY) {
			if (adventureX < goldX && (adventureX + 1 < rows) && plane[adventureX + 1][adventureY] != 'P') {
				adventureX++;
			} else if (adventureX > goldX && (adventureX - 1 >= 0) && plane[adventureX - 1][adventureY] != 'P') {
				adventureX--;
			} else if (adventureY < goldY && (adventureY + 1 < cols) && plane[adventureX][adventureY + 1] != 'P') {
				adventureY++;
			} else if (adventureY > goldY && (adventureY - 1 >= 0) && plane[adventureX][adventureY - 1] != 'P') {
				adventureY--;
			} else {
				return -1;
			}
			steps++;
		}

		return steps;

	}

	public static int minStepsWithMonsterandPits(char[][] plane, char adventure, char gold) {
		int possibleWithMonster = minStepsWithMonster(plane, adventure, gold);
		int possibleWithPits = minStepsWithPits(plane, adventure, gold);
		if (possibleWithMonster < 0 && possibleWithPits < 0) {
			return -1;
		} else if (possibleWithPits > possibleWithMonster) {
			return -1;
		} else if (possibleWithMonster < 0) {
			return possibleWithPits;
		} else if (possibleWithPits < 0) {
			return possibleWithMonster;
		}
		return Math.min(possibleWithMonster, possibleWithPits);
	}

	public static int minStepsWithMonsterandPitsandTriggers(char[][] plane, char adventure, char gold) {
		int minStepWithoutTrigger = minStepsWithMonsterandPits(plane, adventure, gold);
		int minStepWithtrigger = minStepwithTrigger(plane, adventure, gold);
		if (minStepWithoutTrigger < 0) {
			return minStepWithtrigger;
		}
		if (minStepWithoutTrigger > 0) {
			return Math.min(minStepWithoutTrigger, minStepWithtrigger);
		}
		return -1;
	}

	public static void main(String[] args) {
		char[][] plane = new char[5][4];

		plane[4][0] = 'A';
		plane[0][3] = 'G';
		int output1 = minSteps(plane, 'A', 'G');
		System.out.println("Minimum Number of Steps : " + output1);
		System.out.println();

		plane = new char[5][4];
		plane[4][0] = 'A';
		plane[3][2] = 'G';
		plane[2][0] = 'M';
		int output2 = minStepsWithMonster(plane, 'A', 'G');
		System.out.println(output2 >= 0 ? ("Minimum Number of Steps : " + output2) : ("No Possible Solution"));
		System.out.println();

		List<List<Integer>> output3 = minStepPath(plane, 'A', 'G');
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
		System.out.println();
		System.out.println();

		plane = new char[5][4];
		plane[3][0] = 'A';
		plane[1][2] = 'G';
		plane[2][0] = 'M';
		plane[3][3] = 'T';
		int output4 = minStepwithTrigger(plane, 'A', 'G');
		System.out.println("Minimum Number of Steps : " + output4);
		System.out.println();

		plane = new char[5][4];
		plane[3][0] = 'A';
		plane[1][2] = 'G';
		plane[1][0] = 'P';
		plane[2][0] = 'P';
		plane[2][1] = 'P';
		plane[3][1] = 'P';
		plane[3][2] = 'P';
		plane[4][0] = 'P';
		int output5 = minStepsWithPits(plane, 'A', 'G');
		System.out.println(output5 >= 0 ? ("Minimum Number of Steps : " + output5) : ("No Possible Solution"));
		System.out.println();

		plane = new char[5][4];
		plane[3][0] = 'A';
		plane[2][3] = 'G';
		plane[0][0] = 'M';
		plane[1][0] = 'P';
		plane[3][2] = 'P';
		int output6 = minStepsWithMonsterandPits(plane, 'A', 'G');
		System.out.println(output6 >= 0 ? ("Minimum Number of Steps : " + output6) : ("No Possible Solution"));
		System.out.println();

		plane = new char[5][4];
		plane[3][0] = 'A';
		plane[0][2] = 'G';
		plane[0][0] = 'M';
		plane[3][3] = 'T';
		plane[1][0] = 'P';
		plane[3][1] = 'P';
		plane[3][2] = 'P';
		int output7 = minStepsWithMonsterandPitsandTriggers(plane, 'A', 'G');
		System.out.println(output7 >= 0 ? ("Minimum Number of Steps : " + output7) : ("No Possible Solution"));
		System.out.println();
	}
}
