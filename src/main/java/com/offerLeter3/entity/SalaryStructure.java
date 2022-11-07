package com.offerLeter3.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SalaryStructure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sid;
	private double basicSalary;
	private double homeRentAllowance;
	private double telephoneInternetAllowance;
	private double leaveTravelAllowance;
	private double medicalReimbursement;
	private double specialAllowance;
	private double conveyence;

	

	public SalaryStructure() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public SalaryStructure(Long sid, double basicSalary, double homeRentAllowance, double telephoneInternetAllowance,
//			double leaveTravelAllowance, double medicalReimbursement, double specialAllowance, double conveyence
//			) {
//		super();
//		this.sid = sid;
//		this.basicSalary = basicSalary;
//		this.homeRentAllowance = homeRentAllowance;
//		this.telephoneInternetAllowance = telephoneInternetAllowance;
//		this.leaveTravelAllowance = leaveTravelAllowance;
//		this.medicalReimbursement = medicalReimbursement;
//		this.specialAllowance = specialAllowance;
//		this.conveyence = conveyence;
//		
//	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHomeRentAllowance() {
		return homeRentAllowance;
	}

	public void setHomeRentAllowance(double homeRentAllowance) {
		this.homeRentAllowance = homeRentAllowance;
	}

	public double getTelephoneInternetAllowance() {
		return telephoneInternetAllowance;
	}

	public void setTelephoneInternetAllowance(double telephoneInternetAllowance) {
		this.telephoneInternetAllowance = telephoneInternetAllowance;
	}

	public double getLeaveTravelAllowance() {
		return leaveTravelAllowance;
	}

	public void setLeaveTravelAllowance(double leaveTravelAllowance) {
		this.leaveTravelAllowance = leaveTravelAllowance;
	}

	public double getMedicalReimbursement() {
		return medicalReimbursement;
	}

	public void setMedicalReimbursement(double medicalReimbursement) {
		this.medicalReimbursement = medicalReimbursement;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getConveyence() {
		return conveyence;
	}

	public void setConveyence(double conveyence) {
		this.conveyence = conveyence;
	}

	
}
