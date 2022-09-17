package com.ground.logistics.repository;

import com.ground.logistics.entities.Logistics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Component
public interface LogisticsRepository extends MongoRepository<Logistics,String> {
    @Query("{guideNumber:'?0'}")
    List<Logistics> findByGuideNumber(String guideNumber);
    @Query("{id:'?0'}")
    Optional<Logistics> findById(String id);
}
