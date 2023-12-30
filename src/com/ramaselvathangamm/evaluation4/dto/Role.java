package com.ramaselvathangamm.evaluation4.dto;

import java.util.ArrayList;
import java.util.List;

public class Role {
	private String name;
	private List<Role> subRoles;

	public Role(String name) {
		this.name = name;
		this.subRoles = new ArrayList<Role>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Role> getSubRoles() {
		return subRoles;
	}

	public void setSubRoles(List<Role> subRoles) {
		this.subRoles = subRoles;
	}

	public void addSubRole(Role subRole) {
		subRoles.add(subRole);
	}

}