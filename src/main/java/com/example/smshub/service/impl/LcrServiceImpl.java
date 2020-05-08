//package com.example.smshub.service.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//import com.example.smshub.dao.LcrDao;
//import com.example.smshub.model.Lcr;
//import com.example.smshub.model.LcrDto;
//import com.example.smshub.service.LcrService;
//
//import java.util.ArrayList;
//
//
//
//@Transactional
//@Service(value = "LcrService")
//
//public class LcrServiceImpl implements LcrService{
//	
//	@Autowired
//	private LcrDao lcrdao;
//	public List< Lcr> findAll() {
//		List< Lcr> list = new ArrayList<>();
//		 lcrdao.findAll().iterator().forEachRemaining(list::add);
//		return list;
//	}
//	
//	@Override
//	public void delete(int lcr_id) {
//		lcrdao.deleteById(lcr_id);
//	}
//
////	@Override
////	public Lcr findOne(String lcr_name) {
////		return lcrdao.findByLcr_name(lcr_name);
////	}
//
//	@Override
//	public Lcr findById(int lcr_id) {
//		Optional<Lcr> optionalUser = lcrdao.findById(lcr_id);
//		return optionalUser.isPresent() ? optionalUser.get() : null;
//	}
//
//    @Override
//    public LcrDto update(LcrDto lcrDto) {
//        Lcr lcr_data = findById(lcrDto.getLcr_id());
//        if(lcr_data != null) {
//            BeanUtils.copyProperties(lcrDto, lcr_data, "password", "username");
//            lcrdao.save(lcr_data);
//        }
//        return lcrDto;
//    }
//
//    @Override
//	public Lcr save(LcrDto lcr) {
//		Lcr newLcr = new Lcr();
//    	newLcr.setLcr_name(lcr.getLcr_name());
//    	newLcr.setLcr_type(lcr. getLcr_type());
//        return lcrdao.save(newLcr);
//    }
//
//
//
//}
