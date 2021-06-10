package com.careerit.cj.oops.ipl;

public class RoleCount {

	private String roleName;
	private int count;
	
	public RoleCount(String roleName, int count) {
		super();
		this.roleName = roleName;
		this.count = count;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
