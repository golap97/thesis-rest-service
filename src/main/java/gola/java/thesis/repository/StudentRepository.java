package gola.java.thesis.repository;

import gola.java.thesis.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findById(int id);
    Student findByFieldOfStudy(String fieldOfStudy);
    Student findByPhone(int phone);
}
