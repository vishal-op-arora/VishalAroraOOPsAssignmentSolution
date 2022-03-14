package com.greatlearning.dept.model;

public class AdminDepartment extends SuperDepartment {
	
	@Override
	public String departmentName() {
		return " Admin Department ";
	}
	
	@Override
	public String getTodaysWork () {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
		return " Complete by EOD ";
	}
}
