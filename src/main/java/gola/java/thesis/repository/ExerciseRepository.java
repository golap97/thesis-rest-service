package gola.java.thesis.repository;

import gola.java.thesis.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {

    Exercise findById(int id);
    Exercise findByContent(String content);
    Exercise findByAuthor(String author);
}
