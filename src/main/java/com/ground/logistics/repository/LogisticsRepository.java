package com.ground.logistics.repository;

import com.ground.logistics.entities.Logistics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface LogisticsRepository extends MongoRepository<Logistics,String> {
}
