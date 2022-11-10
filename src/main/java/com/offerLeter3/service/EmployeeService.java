package com.offerLeter3.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offerLeter3.entity.Employee;
import com.offerLeter3.entity.SalaryStructure;
import com.offerLeter3.repository.EmployeeRepository;
import com.offerLeter3.repository.SalaryStructureRepository;

@Service
@Transactional
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SalaryStructureRepository salaryStructureRepository;
	
	SalaryStructure salaryStructure = new SalaryStructure();
	
	//displaying all employees using id;;
	
	public Employee getById(Long id){
		
		return employeeRepository.findById(id).get();
	}
	
	
	public SalaryStructure monthCalculator(double ctc) {
		

		SalaryStructure salaryStructure = new SalaryStructure();
		salaryStructure.setBasicSalary((ctc * 50/ 100 )/12);
		salaryStructure.setHomeRentAllowance((ctc * 12 / 100)/12);
		salaryStructure.setLeaveTravelAllowance(1200);
		salaryStructure.setMedicalReimbursement(1500);
		salaryStructure.setSpecialAllowance(1153);
		salaryStructure.setTelephoneInternetAllowance(1500);
		salaryStructure.setConveyence(1600);
		
		  
		return salaryStructure;
		
	}
	
	public Employee save(Employee employee) {
		
		
		return  employeeRepository.save(employee);
	}
	public SalaryStructure saveSalary(SalaryStructure salaryStructure) {
		
		
		return salaryStructureRepository.save(salaryStructure);
	}
	
	//employee details by ctc::
	
	public List<Employee> employeeListByCtc(double ctc){
		
		List<Employee> employee =  employeeRepository.findByCtc(ctc);
		
		for (Employee employee2 : employee) {
			
			System.out.println(employee2);
		}
		
		
		
		return employee;
	}
	
	//updating employee ::
	
	public Employee updateEmployee(Employee employee, Long id) {
		
		
		Employee employeedb = employeeRepository.findById(id).get();
		
		
		if(Objects.nonNull(employee.getName()) && !"".equalsIgnoreCase(employee.getName())) {
			
			employeedb.setName(employee.getName());
			
		}
		
		if(Objects.nonNull(employee.getPhone()) && !"".equalsIgnoreCase(employee.getPhone())) {
			
			employeedb.setPhone(employee.getPhone());
		}
		
		if(Objects.nonNull(employee.getCtc())) {
			
			employeedb.setCtc(employee.getCtc());
		}
		
		
		
		
		return employeeRepository.save(employeedb);
//		SalaryStructure salaryStructure = new SalaryStructure();
				
	}
	
	//deleting employee ::
	
	public void deleteEmployee(Long id) {
		
		
	}
	
	
}
