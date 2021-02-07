package gola.java.thesis.repository;

import gola.java.thesis.entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Integer> {

    Classes findById(int id);
    Classes findBySubject(String subject);
    Classes findByLecturer(String lecturer);

}
