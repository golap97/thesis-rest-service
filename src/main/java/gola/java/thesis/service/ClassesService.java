package gola.java.thesis.service;

import gola.java.thesis.entity.Classes;
import gola.java.thesis.repository.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassesService {

    @Autowired
    private ClassesRepository repository;

    public Classes saveClasses(Classes classes) {
        return repository.save(classes);
    }

    public List<Classes> saveMoreClasses(List<Classes> classes) {
        return repository.saveAll(classes);
    }

    public List<Classes> getClasses() {
        return repository.findAll();
    }

    public Classes getClassesById(int id) {
        return repository.findById(id);
    }

    public Classes getClassesBySubject(String subject) {
        return repository.findBySubject(subject);
    }

    public Classes getClassesByLecturer(String lecturer) {
        return repository.findByLecturer(lecturer);
    }

    public int deleteClassesById(int id) {
        Classes t = repository.findById(id);
        repository.delete(t);
        return id;
    }

    public Classes updateClasses(Classes classes) {
        return repository.save(classes);
    }

}
