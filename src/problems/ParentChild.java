package problems;

import java.util.Scanner;

public class ParentChild {
	public static int countGrandchildren(String[][] relation, String targetPerson) {
		int grandchild = 0;

		for (int i = 0; i < relation.length; i++) {
			String child = relation[i][0];
			String father = relation[i][1];

			if (father.equals(targetPerson)) {
				grandchild += countChildren(relation, child);
			}
		}

		return grandchild;
	}

	public static int countChildren(String[][] relation, String child) {
		int childCount = 0;

		for (int i = 0; i < relation.length; i++) {
			String father = relation[i][1];

			if (father.equals(child)) {
				childCount++;
			}
		}

		return childCount;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of relationships : ");
		int length = scan.nextInt();
		scan.nextLine();
		String[][] relationships = new String[length][2];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter the Father Name : ");
			String father = scan.nextLine();
			System.out.print("Enter Child Name :  ");
			String child = scan.nextLine();
			relationships[i][1] = father;
			relationships[i][0] = child;
		}
		System.out.print("Enter the target person : ");
		String targetPerson = scan.nextLine();
		int grandchildCount = countGrandchildren(relationships, targetPerson);
		System.out.println("The number of grandchildren for " + targetPerson + " is: " + grandchildCount);
		scan.close();
	}
}
