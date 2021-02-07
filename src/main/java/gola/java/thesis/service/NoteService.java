package gola.java.thesis.service;

import gola.java.thesis.entity.Note;
import gola.java.thesis.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository repository;

    public Note saveNote(Note note) {
        return repository.save(note);
    }

    public List<Note> saveNote(List<Note> note) {
        return repository.saveAll(note);
    }


    public List<Note> getNotes() {
        return repository.findAll();
    }

    public Note getNoteByTitle(String title) {
        return repository.findByTitle(title);
    }

    public Note getNoteById(int id) {
        return repository.findById(id);
    }


    public int deleteById(int id) {
        Note n = repository.findById(id);
        repository.delete(n);
        return id;
    }

    public Note updateNote(Note note) {
        return repository.save(note);
    }
}
