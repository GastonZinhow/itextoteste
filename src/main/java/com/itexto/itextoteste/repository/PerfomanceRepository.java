package com.itexto.itextoteste.repository;

import com.itexto.itextoteste.entity.Performance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfomanceRepository extends MongoRepository<Performance, Integer> {
}
