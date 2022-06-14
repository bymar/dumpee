package br.com.cesarschool.dumpeeapi.repository;

import br.com.cesarschool.dumpeeapi.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
