package com.offerLeter3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.offerLeter3.entity.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {
    
	public List<EmployeeDetails> findByBeforeIncrementedSalary(double beforeIncrementedSalary);
}
