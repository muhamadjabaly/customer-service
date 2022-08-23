package com.demo.fraud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface FraudCheckRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
