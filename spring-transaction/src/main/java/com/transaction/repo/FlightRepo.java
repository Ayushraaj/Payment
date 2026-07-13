package com.transaction.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.entity.FlightEntity;

public interface FlightRepo  extends JpaRepository<FlightEntity, Long>{

}
