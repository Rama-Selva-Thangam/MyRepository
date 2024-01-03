package com.ramaselvathangamm.evaluation4;

import java.util.Scanner;

import com.ramaselvathangamm.evaluation4.performoperations.PerformOperationsView;

public class RoleHierarchy {

	public static void main(String[] args) {
		RoleHierarchy roleHierarchy = new RoleHierarchy();
		roleHierarchy.init();
	}

	private void init() {
		Scanner scan = new Scanner(System.in);
		PerformOperationsView performOperationsView = new PerformOperationsView();
		int operation;
		do {
			System.out.println("Operations:");
			System.out.println(
					"1.Add Root\n2.Add Sub Role\n3.Display Roles\n4.Delete Roles\n5.Add User\n6.Display Users\n7.Display Users with Sub users\n8.Delete User\n9.Number of User from top\n10.Height of Role Heirarchy\n11.Common Boss of User\n0.Exit");
			System.out.println("--------------------------------------------");
			System.out.print("Operation to be performed : ");

			operation = scan.nextInt();
			scan.nextLine();
			switch (operation) {
			case 1:
				performOperationsView.createRootRole();
				System.out.println("--------------------------------------------");
				break;
			case 2:
				performOperationsView.addSubRole();
				System.out.println("--------------------------------------------");
				break;
			case 3:
				performOperationsView.displayRole();
				System.out.println("--------------------------------------------");
				break;
			case 4:
				performOperationsView.deleteRole();
				System.out.println("--------------------------------------------");

				break;
			case 5:
				performOperationsView.assignRole();
				System.out.println("--------------------------------------------");
				break;
			case 6:
				performOperationsView.displayUsers();
				System.out.println("--------------------------------------------");
				break;
			case 7:
				performOperationsView.displayUsersandSubUsers();
				System.out.println("--------------------------------------------");
				break;

			case 0:
				break;
			default:
				System.out.println("Invalid operation.");
			}

		} while (operation != 0);

	}
}
