package gola.java.thesis.controller;

import gola.java.thesis.entity.Classes;
import gola.java.thesis.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    private ClassesService service;

    @PostMapping("/addclasses")
    public Classes addClasses(@RequestBody Classes classes) {
        return service.saveClasses(classes);
    }

    @PostMapping("/addmoreclasses")
    public List<Classes> addMoreClasses(@RequestBody List<Classes> classes) {
        return service.saveMoreClasses(classes);
    }

    @GetMapping("/allclasses")
    public  List<Classes> findAllClasses() {
        return service.getClasses();
    }

    @GetMapping("/classesbyid/{id}")
    public Classes findById(@PathVariable int id) {
        return service.getClassesById(id);
    }

    @GetMapping("/classesbysubject")
    public Classes findBySubject(@PathVariable String subject) {
        return service.getClassesBySubject(subject);
    }

    @GetMapping("/classesbylecturer")
    public Classes findByLecturer(@PathVariable String lecturer) {
        return service.getClassesByLecturer(lecturer);
    }

    @PutMapping("/update")
    public Classes updateClasses(@RequestBody Classes classes) {
        return service.updateClasses(classes);
    }

    @DeleteMapping(value = "/deleteclasses/{id}")
    public int deleteClassesById(@PathVariable int id) {
        return service.deleteClassesById(id);
    }
}
