package com.ramaselvathangamm.evaluation3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		question3();
	}

	private static void question1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Row X Column : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] plane = new char[row][col];
		System.out.print("Enter Adventure Position : ");
		int adventureX = scan.nextInt();
		int adventureY = scan.nextInt();
		System.out.print("Enter the Gold Position : ");
		int goldX = scan.nextInt();
		int goldY = scan.nextInt();
		plane[adventureX - 1][adventureY - 1] = 'A';
		plane[goldX - 1][goldY - 1] = 'G';
		int output1 = minSteps(plane, 'A', 'G');
		System.out.println("Minimum Number of Steps : " + output1);
		System.out.println();
	}

	private static void question2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Row X Column : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] plane = new char[row][col];
		System.out.print("Enter Adventure Position : ");
		int adventureX = scan.nextInt();
		int adventureY = scan.nextInt();
		System.out.print("Enter the Gold Position : ");
		int goldX = scan.nextInt();
		int goldY = scan.nextInt();
		System.out.print("Enter the Monster Position : ");
		int monsterX = scan.nextInt();
		int monsterY = scan.nextInt();
		plane[adventureX - 1][adventureY - 1] = 'A';
		plane[goldX - 1][goldY - 1] = 'G';
		plane[monsterX - 1][monsterY - 1] = 'M';
		int output1 = minStepsWithMonster(plane, 'A', 'G');
		System.out.println(output1 >= 0 ? ("Minimum Number of Steps : " + output1) : ("No Possible Solution"));
		System.out.println();
	}

	private static void question3() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Row X Column : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] plane = new char[row][col];
		System.out.print("Enter Adventure Position : ");
		int adventureX = scan.nextInt();
		int adventureY = scan.nextInt();
		System.out.print("Enter the Gold Position : ");
		int goldX = scan.nextInt();
		int goldY = scan.nextInt();
		System.out.print("Enter the Monster Position : ");
		int monsterX = scan.nextInt();
		int monsterY = scan.nextInt();
		plane[adventureX - 1][adventureY - 1] = 'A';
		plane[goldX - 1][goldY - 1] = 'G';
		plane[monsterX - 1][monsterY - 1] = 'M';
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
	}

	private static void question4() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Row X Column : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] plane = new char[row][col];
		System.out.print("Enter Adventure Position : ");
		int adventureX = scan.nextInt();
		int adventureY = scan.nextInt();
		System.out.print("Enter the Gold Position : ");
		int goldX = scan.nextInt();
		int goldY = scan.nextInt();
		System.out.print("Enter the Monster Position : ");
		int monsterX = scan.nextInt();
		int monsterY = scan.nextInt();
		System.out.print("Enter the Trigger Position : ");
		int triggerX = scan.nextInt();
		int triggerY = scan.nextInt();
		plane[adventureX - 1][adventureY - 1] = 'A';
		plane[goldX - 1][goldY - 1] = 'G';
		plane[monsterX - 1][monsterY - 1] = 'M';
		plane[triggerX - 1][triggerY - 1] = 'T';
		int output1 = minStepwithTrigger(plane, 'A', 'G');
		System.out.println(output1 >= 0 ? ("Minimum Number of Steps : " + output1) : ("No Possible Solution"));
		System.out.println();
	}

	private void question5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Row X Column : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] plane = new char[row][col];
		System.out.print("Enter Adventure Position : ");
		int adventureX = scan.nextInt();
		int adventureY = scan.nextInt();
		System.out.print("Enter the Gold Position : ");
		int goldX = scan.nextInt();
		int goldY = scan.nextInt();
		System.out.print("Enter the Number of Pits : ");
		int noOfPits = scan.nextInt();
		for (int i = 0; i < noOfPits; i++) {
			System.out.print("Enter Pit " + (i + 1) + "Position : ");
			int pitX = scan.nextInt();
			int pitY = scan.nextInt();
			plane[pitX - 1][pitY - 1] = 'P';

		}
		plane[adventureX - 1][adventureY - 1] = 'A';
		plane[goldX - 1][goldY - 1] = 'G';
		int output1 = minStepwithTrigger(plane, 'A', 'G');
		System.out.println(output1 >= 0 ? ("Minimum Number of Steps : " + output1) : ("No Possible Solution"));
		System.out.println();
	}

	private static void question6() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Row X Column : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] plane = new char[row][col];
		System.out.print("Enter Adventure Position : ");
		int adventureX = scan.nextInt();
		int adventureY = scan.nextInt();
		System.out.print("Enter the Gold Position : ");
		int goldX = scan.nextInt();
		int goldY = scan.nextInt();
		System.out.print("Enter the Monster Position : ");
		int monsterX = scan.nextInt();
		int monsterY = scan.nextInt();
		System.out.print("Enter the Number of Pits : ");
		int noOfPits = scan.nextInt();
		for (int i = 0; i < noOfPits; i++) {
			System.out.print("Enter Pit " + (i + 1) + "Position : ");
			int pitX = scan.nextInt();
			int pitY = scan.nextInt();
			plane[pitX - 1][pitY - 1] = 'P';

		}
		plane[adventureX - 1][adventureY - 1] = 'A';
		plane[goldX - 1][goldY - 1] = 'G';
		plane[monsterX - 1][monsterY - 1] = 'M';

		int output1 = minStepsWithMonsterandPits(plane, 'A', 'G');
		System.out.println(output1 >= 0 ? ("Minimum Number of Steps : " + output1) : ("No Possible Solution"));
		System.out.println();
	}
}
