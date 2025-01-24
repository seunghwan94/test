package com.example.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo.entity.Student;


public interface StudentRepository extends MongoRepository<Student,Long>{
  
}
