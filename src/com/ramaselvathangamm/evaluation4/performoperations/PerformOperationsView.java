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
		System.out.print("Enter parent role name: ");
		String parentRoleName = scan.nextLine().trim();
		System.out.print("Enter sub role name: ");
		String subRoleName = scan.nextLine().trim();
		int status = performOperationsViewModel.addSubRole(parentRoleName, subRoleName);
		if (status == 0) {
			displayRole();
		} else {
			System.out.println("Failed to add sub-role.");
		}
	}

	private void displayRole() {
		for (String s : performOperationsViewModel.displayRole()) {
			System.out.println(s);
		}

	}

}
