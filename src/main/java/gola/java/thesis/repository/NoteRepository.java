package gola.java.thesis.repository;

import gola.java.thesis.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {

    Note findById(int id);
    Note findByTitle(String title);
}
