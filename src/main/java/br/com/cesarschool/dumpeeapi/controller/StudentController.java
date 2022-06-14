package br.com.cesarschool.dumpeeapi.controller;

import br.com.cesarschool.dumpeeapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/student")
@RestController
public class StudentController {

  @Autowired
  StudentService service;

  @GetMapping
  public void getStudentInfo() {

  }

  @PostMapping("/signup")
  public void setupNewStudent() {

  }
}
