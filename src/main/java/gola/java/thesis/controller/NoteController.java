package gola.java.thesis.controller;

import gola.java.thesis.entity.Note;
import gola.java.thesis.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteService service;

    @PostMapping("/addnote")
    public Note addNote(@RequestBody Note note) {
        return service.saveNote(note);
    }

    @PostMapping("/addnotes")
    public List<Note> addNotes(@RequestBody List<Note> notes) {
        return service.saveNote(notes);
    }

    @GetMapping("/allnotes")
    public List<Note> findAllNotes() {
        return service.getNotes();
    }

    @GetMapping(value = "/notebyid/{id}")
    public Note findById(@PathVariable int id) {
        return service.getNoteById(id);
    }

    @GetMapping("/notebytitle/{title}")
    public Note findByTitle(@PathVariable String title) {
        return service.getNoteByTitle(title);
    }

    @PutMapping("/update")
    public Note updateNote(@RequestBody Note note) {
        return service.updateNote(note);
    }

    @DeleteMapping(value = "/deletenote/{id}")
    public int deleteNote(@PathVariable int id) {
        return service.deleteById(id);
    }

}
