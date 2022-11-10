package com.offerLeter3.service;

import java.util.List;
import java.util.Objects;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.offerLeter3.entity.Employee;
import com.offerLeter3.entity.EmployeeDetails;
import com.offerLeter3.entity.SalaryStructure;
import com.offerLeter3.repository.EmployeeDetailsRepository;
import com.offerLeter3.repository.EmployeeRepository;
import com.offerLeter3.repository.SalaryStructureRepository;

@Service
@Transactional
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
	
	@Autowired
	private SalaryStructureRepository salaryStructureRepository;
	
	SalaryStructure salaryStructure = new SalaryStructure();
	
	//displaying all employees using id;;
	
	public Employee getById(Long id){
		
		return employeeRepository.findById(id).get();
	}
	
	
	public SalaryStructure ctcCalculator(double ctc) {
		

		SalaryStructure salaryStructure = new SalaryStructure();
		
		
		salaryStructure.setBasicSalary(ctc * 50 / 100);
		salaryStructure.setHomeRentAllowance(ctc * 40 / 100);
		salaryStructure.setLeaveTravelAllowance(20400);
		salaryStructure.setMedicalReimbursement(15000);
		salaryStructure.setSpecialAllowance(11532);
		salaryStructure.setTelephoneInternetAllowance(18000);
		salaryStructure.setConveyence(19200);
		
		  
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
	
	  // Increment Letter Services :-
	
	
	public List<EmployeeDetails> listAll(){
		return employeeDetailsRepository.findAll();
	}
	
    
	public Double calculator(double beforeIncrementedSalary ) {
		
		double newSalary = (beforeIncrementedSalary*(1.1));
		return newSalary;
	}
	
    
    public EmployeeDetails save(EmployeeDetails employeeDetails) {
		
		return employeeDetailsRepository.save(employeeDetails);
	
	}
	
	
   public List<EmployeeDetails> get(Double beforeIncrementedSalary){
	
	return employeeDetailsRepository.findByBeforeIncrementedSalary(beforeIncrementedSalary);
   
   }
   
   
   public EmployeeDetails getById(Integer id){
		
		return employeeDetailsRepository.findById(id).get();
	}
   
  
   public EmployeeDetails updateEmployeeDetails(EmployeeDetails employeeDetails, Integer id) {
		
		
		EmployeeDetails empDetails = employeeDetailsRepository.findById(id).get();
		
		
		if(Objects.nonNull(employeeDetails.getEmployeeName()) && !"".equalsIgnoreCase(employeeDetails.getEmployeeName())) {
			
			empDetails.setEmployeeName(employeeDetails.getEmployeeName());
			
		}
		
		if(Objects.nonNull(employeeDetails.getEmployeeDepartment()) && !"".equalsIgnoreCase(employeeDetails.getEmployeeDepartment())) {
			
			empDetails.setEmployeeDepartment(employeeDetails.getEmployeeDepartment());
		}
		
        if(Objects.nonNull(employeeDetails.getEmployeeDesignation()) && !"".equalsIgnoreCase(employeeDetails.getEmployeeDesignation())) {
			
			empDetails.setEmployeeDesignation(employeeDetails.getEmployeeDesignation());
		}
        
        if(Objects.nonNull(employeeDetails.getEmployeeJoiningDate()) && !"".equalsIgnoreCase(employeeDetails.getEmployeeJoiningDate())) {
			
			empDetails.setEmployeeJoiningDate(employeeDetails.getEmployeeDepartment());
		}
		
		if(Objects.nonNull(employeeDetails.getBeforeIncrementedSalary())) {
			
			empDetails.setBeforeIncrementedSalary(employeeDetails.getBeforeIncrementedSalary());
		}
		
		
		return employeeDetailsRepository.save(empDetails);
   }  

}
