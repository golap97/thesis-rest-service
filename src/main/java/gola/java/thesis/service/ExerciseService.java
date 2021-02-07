package gola.java.thesis.service;

import gola.java.thesis.entity.Exercise;
import gola.java.thesis.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository repository;

    public Exercise saveExercise(Exercise exercise) {
        return repository.save(exercise);
    }

    public List<Exercise> saveExercises(List<Exercise> exercises) {
        return repository.saveAll(exercises);
    }

    public List<Exercise> getExercises() {
        return repository.findAll();
    }

    public Exercise getExerciseById(int id) {
        return repository.findById(id);
    }

    public Exercise getExerciseByContent(String content) {
        return repository.findByContent(content);
    }

    public Exercise getExerciseByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    public Exercise updateExercise(Exercise exercise) {
        return repository.save(exercise);
    }

    public int deleteExerciseById(int id) {
        Exercise e = repository.findById(id);
        repository.delete(e);
        return id;
    }

}
