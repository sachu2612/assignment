package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.IStatistics;
import com.example.demo.model.TransactionModel;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionModel, Long>{

	@Query("SELECT sum(t.amount) as sum, avg(t.amount) as avg, max(t.amount) as max,"
			+ " min(t.amount) as min,count(*) as count from TransactionModel as t where DATEDIFF(SECOND, CURRENT_TIMESTAMP, t.timestamp) <= 60")
	IStatistics findStatistics();
  
}
