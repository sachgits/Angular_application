package com.nasscom.einvoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nasscom.einvoice.entity.ResponseTransaction;

@Repository
public interface ResponseTransactionRepository extends JpaRepository<ResponseTransaction, Long>{
	
}
