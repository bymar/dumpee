package br.com.cesarschool.dumpeeapi.service;

import br.com.cesarschool.dumpeeapi.entities.Student;
import br.com.cesarschool.dumpeeapi.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  @Autowired
  StudentRepository repository;

  public List<Student> getAllStudents() {
    return repository.findAll();
  }
}
