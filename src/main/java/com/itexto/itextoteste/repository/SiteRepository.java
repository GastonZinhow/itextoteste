package com.itexto.itextoteste.repository;

import com.itexto.itextoteste.entity.Site;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends MongoRepository<Site, Integer> {
}
