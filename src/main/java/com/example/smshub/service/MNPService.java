package com.example.smshub.service;

import java.util.List;

import com.example.smshub.model.MNP;
import com.example.smshub.model.MNPdto;

public interface MNPService {
	MNP save(MNPdto mnp);
	List<MNP> findAll();
	void delete(int mnp_id);



	MNP findById(int mnp_id);

	MNPdto update(MNPdto mnp);
}
