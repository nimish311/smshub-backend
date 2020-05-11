package com.example.smshub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smshub.model.ApiResponse;
import com.example.smshub.model.OperatorDetails;
import com.example.smshub.service.OperatorDetailsService;

@RestController
@RequestMapping

public class OperatorDetailsController {
	
	@Autowired
	private OperatorDetailsService service;
	
	@GetMapping("/operator")
	@CrossOrigin
	public ApiResponse<List<OperatorDetails>> listOperator(){
    	return new ApiResponse<>(HttpStatus.OK.value(), "Operators fetched successfully", service.findOperator());
    }
}
