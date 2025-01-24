package com.example.mongo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.entity.Student;
import com.example.mongo.service.StudentService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@AllArgsConstructor
// @RequestMapping("/")
public class StudentController {
  private StudentService service;

  @PostMapping("register")
  public void repository(@RequestBody Student student){
    service.add(student);
  }
  @GetMapping("student")
  public List<Student> list() {
      return service.list();
  }

  @GetMapping("student/{no}")
  public Student get(@PathVariable Long no){
    return service.get(no).orElse(null);
  }
}
