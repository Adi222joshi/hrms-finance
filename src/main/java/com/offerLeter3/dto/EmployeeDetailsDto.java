package com.offerLeter3.dto;

public class EmployeeDetailsDto {
   
    private String employeeName;
	
	private String employeeDepartment;
	
	private String employeeDesignation;
	
	private String employeeJoiningDate;
	
	private double beforeIncrementedSalary;

	public EmployeeDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}

	public void setEmployeeJoiningDate(String employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}

	public double getBeforeIncrementedSalary() {
		return beforeIncrementedSalary;
	}

	public void setBeforeIncrementedSalary(double beforeIncrementedSalary) {
		this.beforeIncrementedSalary = beforeIncrementedSalary;
	}
	
	
}
