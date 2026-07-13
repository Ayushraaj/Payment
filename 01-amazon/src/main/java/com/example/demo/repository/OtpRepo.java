package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OtpEntity;


@Repository
public interface OtpRepo extends JpaRepository<OtpEntity, Long> {
	
	 OtpEntity findByMobileNumber(int mobileNumber);
}
