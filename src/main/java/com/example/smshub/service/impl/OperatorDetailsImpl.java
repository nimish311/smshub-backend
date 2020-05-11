package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.dao.OperatorDetailsdao;
import com.example.smshub.model.OperatorDetails;
import com.example.smshub.service.OperatorDetailsService;

@Transactional
@Service("OperatorDetailsService")

public class OperatorDetailsImpl implements OperatorDetailsService{
	@Autowired
	private OperatorDetailsdao dao;
	
	@Override
	public List<OperatorDetails> findOperator() {
		List<OperatorDetails> list = new ArrayList<>();
		dao.findOperator().iterator().forEachRemaining(list::add);
		return list;
	}

}
