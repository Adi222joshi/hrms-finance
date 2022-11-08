package com.offerLeter3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_Details")
public class EmployeeDetails {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "employee_id")
	private Integer employeeId;
	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "employee_department")
	private String employeeDepartment;
	@Column(name = "employee_designation")
	private String employeeDesignation;
	@Column(name = "employee_joiningdate")
	private String employeeJoiningDate;
	@Column(name = "before_incSalary")
	private double beforeIncrementedSalary;
	@Column(name = "after_incSalary")
	private double afterIncrementedSalary;
	
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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

	public double getAfterIncrementedSalary() {
		return afterIncrementedSalary;
	}

	public void setAfterIncrementedSalary(double afterIncrementedSalary) {
		this.afterIncrementedSalary = afterIncrementedSalary;
	}

	
	
}