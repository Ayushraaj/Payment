package com.irctc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.entity.BookingRecords;

@Repository
public interface BookingRecordsRepo extends JpaRepository<BookingRecords, Long> {

}
