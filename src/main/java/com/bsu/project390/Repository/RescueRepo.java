package com.bsu.project390.Repository;

import com.bsu.project390.Model.Rescue;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RescueRepo extends MongoRepository<Rescue,Integer> {
}
