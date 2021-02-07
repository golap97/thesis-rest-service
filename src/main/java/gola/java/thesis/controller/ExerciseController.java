package gola.java.thesis.controller;

import gola.java.thesis.entity.Exercise;
import gola.java.thesis.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService service;

    @PostMapping("/addexercise")
    public Exercise addExercise(@RequestBody Exercise exercise) {
        return service.saveExercise(exercise);
    }

    @PostMapping("/addexercises")
    public List<Exercise> addExercises(@RequestBody List<Exercise> exercises) {
        return service.saveExercises(exercises);
    }

    @GetMapping("/allexercises")
    public List<Exercise> getExercises() {
        return service.getExercises();
    }

    @GetMapping("/exercisebyid/{id}")
    public Exercise getExerciseById(@PathVariable int id) {
        return service.getExerciseById(id);
    }

    @GetMapping("/exercisebycontent/{content}")
    public Exercise getExerciseByContent(@PathVariable String content) {
        return service.getExerciseByContent(content);
    }

    @GetMapping("/exercisebyauthor/{author}")
    public Exercise getExerciseByAuthor(@PathVariable String author) {
        return service.getExerciseByAuthor(author);
    }

    @PutMapping("/update")
    public Exercise updateExercise(@RequestBody Exercise exercise) {
        return service.updateExercise(exercise);
    }

    @DeleteMapping("/delete/{id}")
    public int deleteExerciseById(@PathVariable int id) {
        return service.deleteExerciseById(id);
    }
}