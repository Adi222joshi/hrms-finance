package com.offerLeter3.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "ctc")
	private double ctc;

	@Column(name = "phone")
	private String phone;
	
//	@JsonManagedReference
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sid")
	private SalaryStructure salaryStructure;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Employee(Long id, String name, double ctc, String phone, SalaryStructure salaryStructure) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.ctc = ctc;
//		this.phone = phone;
//		this.salaryStructure = salaryStructure;
//	}
//
//	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCtc() {
		return ctc;
	}

	public void setCtc(double ctc) {
		this.ctc = ctc;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public SalaryStructure getSalaryStructure() {
		return salaryStructure;
	}

	public void setSalaryStructure(SalaryStructure salaryStructure) {
		this.salaryStructure = salaryStructure;
	}

}
