package com.ground.logistics.repository;

import com.ground.logistics.entities.Logistics;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogisticsRepository extends MongoRepository<Logistics,String> {
}
