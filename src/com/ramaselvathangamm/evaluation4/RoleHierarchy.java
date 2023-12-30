package com.ramaselvathangamm.evaluation4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ramaselvathangamm.evaluation4.dto.Role;
import com.ramaselvathangamm.evaluation4.performoperations.PerformOperationsView;

public class RoleHierarchy {

	public static void main(String[] args) {
		RoleHierarchy roleHierarchy = new RoleHierarchy();
		// roleHierarchy.init();
		roleHierarchy.question_1();
	}

	private void question_1() {
		new PerformOperationsView().createRootRole();
	}
	private void question2() {
		new PerformOperationsView().addSubRole();
	}

	private void init() {
		Scanner scan = new Scanner(System.in);
		int operation;

		do {
			System.out.println("\nOperations:");
			System.out.println("1. Add Sub Role.");
			System.out.print("Operation to be performed: ");
			operation = scan.nextInt();
			scan.nextInt();

			switch (operation) {
			case 1:

				break;
			default:
				System.out.println("Invalid operation. Exiting.");
				break;
			}

		} while (operation == 1);
	}

	private static void addSubRole(Role rootRole) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter sub role name: ");
		String subRoleName = scanner.nextLine();
		System.out.print("Enter reporting to role name: ");
		String reportingToName = scanner.nextLine();

		Role reportingTo = findRole(rootRole, reportingToName);

		if (reportingTo != null) {
			Role subRole = new Role(subRoleName);
			reportingTo.addSubRole(subRole);
			System.out.println("Added " + subRoleName + " as sub-role to " + reportingToName);
		} else {
			System.out.println("Role " + reportingToName + " not found.");
		}
	}

	private static Role findRole(Role role, String targetName) {
		if (role.getName().equals(targetName)) {
			return role;
		}

		for (Role subRole : role.getSubRoles()) {
			Role result = findRole(subRole, targetName);
			if (result != null) {
				return result;
			}
		}

		return null;
	}
}
