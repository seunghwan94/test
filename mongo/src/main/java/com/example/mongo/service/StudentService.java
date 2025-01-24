package com.example.mongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mongo.entity.Student;
import com.example.mongo.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class StudentService {
  private final StudentRepository repository;

  public void add(Student student){
    repository.save(student);
  }
  public List<Student> list() {
    return repository.findAll();
  }
  public Optional<Student> get(Long no){
    return repository.findById(no);
  }

  

}
