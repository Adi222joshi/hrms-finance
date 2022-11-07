package com.offerLeter3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.offerLeter3.entity.SalaryStructure;

@Repository
public interface SalaryStructureRepository extends JpaRepository<SalaryStructure, Long>{

}
