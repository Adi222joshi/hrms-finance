package com.offerLeter3.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.offerLeter3.entity.Employee;
import com.offerLeter3.entity.SalaryStructure;
import com.offerLeter3.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("employee/{id}")
	public ResponseEntity<Employee> get(@PathVariable Long id) {

		try {

			Employee employee = employeeService.getById(id);

			return new ResponseEntity<Employee>(employee, HttpStatus.OK);

		} catch (NoSuchElementException e) {

			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);

		}

	}
	
	@GetMapping("/{ctc}")
	public List<Employee> ListOfAll(@PathVariable("ctc") double ctc){
		
		return employeeService.employeeListByCtc(ctc);
	}

	@PostMapping("/insertdata")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		double ctc =  employee.getCtc();
		
		SalaryStructure salaryStructure = new SalaryStructure();
		
		salaryStructure =  employeeService.monthCalculator(ctc);
		
		SalaryStructure salaryStructure1 = employeeService.saveSalary(salaryStructure);
		
		employee.setSalaryStructure(salaryStructure);
		employee = employeeService.save(employee); 
		
		return employee;
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("id") Long id) {
		
		
		return employeeService.updateEmployee(employee, id);
		
	}
	
	
	
	
}
