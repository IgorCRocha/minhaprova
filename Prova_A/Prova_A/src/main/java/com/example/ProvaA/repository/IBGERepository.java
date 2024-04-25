package com.example.ProvaA.repository;

import com.example.ProvaA.model.IBGEEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBGERepository extends MongoRepository<IBGEEntity, String> {

}