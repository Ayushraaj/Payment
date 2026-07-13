package com.transaction.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.entity.PaymentEntity;

public interface PaymentRepo extends JpaRepository<PaymentEntity, Long> {

}
