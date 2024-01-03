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

	public void deleteRole() {
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

	public void assignRole() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the User Name : ");
		String userName = scan.nextLine().trim();
		System.out.print("Enter the role name : ");
		String userRole = scan.nextLine().trim();
		int status = performOperationsViewModel.addUser(userName, userRole);
		if (status == 0) {
			System.out.println(userName + " " + userRole);
		} else {
			System.out.println("User not found");
		}
	}

	public void displayRole() {
		for (String role : performOperationsViewModel.displayRole()) {
			System.out.println(role);
		}

	}

	public void displayUsers() {
		for (String user : performOperationsViewModel.displayUsers()) {
			System.out.println(user);
		}
	}

	public void displayUsersandSubUsers() {
		for (String user : performOperationsViewModel.displayUsersandSubUsers()) {
			System.out.println(user);
		}
	}

}
