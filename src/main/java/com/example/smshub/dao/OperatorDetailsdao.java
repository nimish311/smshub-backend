package com.example.smshub.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.smshub.model.OperatorDetails;

@Repository
public interface OperatorDetailsdao extends JpaRepository<OperatorDetails, Integer>{
	
	@Query(value="select * from operator_details", nativeQuery = true)
	List<OperatorDetails> findOperator();
}
