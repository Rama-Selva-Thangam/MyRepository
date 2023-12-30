package com.ramaselvathangamm.evaluation4.performoperations;

import java.util.Scanner;

public class PerformOperationsView {
	PerformOperationsViewModel performOperationsViewModel;

	public PerformOperationsView() {
		this.performOperationsViewModel = new PerformOperationsViewModel(this);
	}

	public void createRootRole() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Root Name : ");
		String rootName = scan.nextLine().trim();
		int status = performOperationsViewModel.createRootRole(rootName);
		if (status == 0) {
			System.out.println("CEO");
		}
	}

	public void addSubRole() {
		Scanner scan = new Scanner(System.in);
		int operation;
		do {
			System.out.println("\nOperations:");
			System.out.println("1. Add Sub Role\n0.Exit");
			System.out.print("Operation to be performed: ");
			operation = scan.nextInt();
			scan.nextLine();
			switch (operation) {
			case 1:
				add();
				break;
			case 2:
				displayRole();
				break;
			case 0:
				break;
			default:
				System.out.println("Invalid operation.");
			}

		} while (operation != 0);

	}

	public void deleteRole() {
		Scanner scan = new Scanner(System.in);
		int operation;
		do {
			System.out.println("\nOperations:");
			System.out.println("1. Add Sub Role\n2.Display Roles\n3.Delete Roles\n0.Exit");
			System.out.print("Operation to be performed: ");
			operation = scan.nextInt();
			scan.nextLine();
			switch (operation) {
			case 1:
				add();
				break;
			case 2:
				displayRole();
				break;
			case 3:
				delete();
				break;
			case 0:
				break;
			default:
				System.out.println("Invalid operation.");
			}

		} while (operation != 0);

	}

	public void displayRole() {
		for (String role : performOperationsViewModel.displayRole()) {
			System.out.println(role);
		}

	}

	private void add() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter sub role name: ");
		String subRoleName = scan.nextLine().trim();
		System.out.print("Enter reporting role name: ");
		String reportingRoleName = scan.nextLine().trim();
		int status = performOperationsViewModel.addSubRole(subRoleName, reportingRoleName);
		if (status == 0) {
			System.out.println(subRoleName + "  " + reportingRoleName);
		} else {
			System.out.println("Failed to add sub-role.");
		}
	}

	private void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the role to be deleted : ");
		String deleteRole = scan.nextLine().trim();
		System.out.print("Enter the role to be transfered : ");
		String transferedRole = scan.nextLine().trim();
		int status = performOperationsViewModel.deleteRole(deleteRole, transferedRole);
		if (status == 0) {
			System.out.println(deleteRole + " Role Deleted and Properties Transfered to " + transferedRole);
		} else {
			System.out.println("Not Deleted");
		}
	}

}
