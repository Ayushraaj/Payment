package com.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.ProductEntity;
import com.zepto.entity.customerEntity;
import com.zepto.repository.ProdRepository;
import com.zepto.request.orderReq;

@Service
public class ProdService {
	
	@Autowired
	ProdRepository repo;
	
	public String InsertData(orderReq order) {
		ProductEntity pentity=new ProductEntity();
		pentity.setProductName(order.getProductName());
		pentity.setDescription(order.getDescription());
		pentity.setPrice(order.getPrice());
		
		customerEntity cusentity=new customerEntity();
		cusentity.setCustomerName(order.getCustomerName());
		cusentity.setStatus(order.getStatus());
		
		pentity.setCusentity(cusentity);
		repo.save(pentity);
		
		
		
		return "insert data succesfully";
		
	}

}
