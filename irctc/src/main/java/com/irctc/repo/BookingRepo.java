package com.irctc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.entity.BookingEntity;


@Repository
public interface BookingRepo extends JpaRepository<BookingEntity, Long> {

	
}
