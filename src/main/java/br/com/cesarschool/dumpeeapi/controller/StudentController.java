package br.com.cesarschool.dumpeeapi.controller;

import br.com.cesarschool.dumpeeapi.controller.response.StudentResponse;
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
  private StudentService service;

  @GetMapping
  public StudentResponse getStudentInfo() {
    return StudentResponse
        .builder()
        .studentData(service.getAllStudents())
        .build();
  }

  @PostMapping("/signup")
  public void setupNewStudent() {

  }
}
