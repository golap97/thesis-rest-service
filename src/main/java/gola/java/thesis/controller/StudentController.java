package gola.java.thesis.controller;

import gola.java.thesis.entity.Student;
import gola.java.thesis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @PostMapping("/addstudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return service.saveStudents(students);
    }


    @GetMapping("/allstudents")
    public List<Student> findAllStudents() {
        return service.getStudents();
    }

    @GetMapping("/studentbyid/{id}")
    public Student findStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @GetMapping("/studentbyphone/{phone}")
    public Student findStudentByPhone(@PathVariable int phone) {
        return service.getStudentByPhone(phone);
    }

    @GetMapping("/studentbyfieldofstudy/{fieldOfStudy}")
    public Student findStudentByFieldOfStudy(@PathVariable String fieldOfStudy) {
        return service.getStudentByFieldOfStudy(fieldOfStudy);
    }


    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }


    @DeleteMapping(value = "deletestudent/{id}")
    public int deleteStudent(@RequestParam int id) {
        return service.deleteStudentById(id);
    }
}
