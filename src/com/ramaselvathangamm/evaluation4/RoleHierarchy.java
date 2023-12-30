package com.ramaselvathangamm.evaluation4;

import com.ramaselvathangamm.evaluation4.performoperations.PerformOperationsView;

public class RoleHierarchy {

	public static void main(String[] args) {
		RoleHierarchy roleHierarchy = new RoleHierarchy();
		roleHierarchy.question_2();
	}

	private void question_1() {
		new PerformOperationsView().createRootRole();
	}
	private void question_2() {
		new PerformOperationsView().addSubRole();
	}
}
