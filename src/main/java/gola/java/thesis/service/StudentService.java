package gola.java.thesis.service;

import gola.java.thesis.entity.Student;
import gola.java.thesis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> student) {
        return repository.saveAll(student);
    }


    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudentByFieldOfStudy(String fieldOfStudy) {
        return repository.findByFieldOfStudy(fieldOfStudy);
    }

    public Student getStudentByPhone(int phone) {
        return repository.findByPhone(phone);
    }

    public Student getStudentById(int id) {
        return repository.findById(id);
    }

    public int deleteStudentById(int id) {
        Student t = repository.findById(id);
        repository.delete(t);
        return id;
    }

    public Student updateStudent(Student student) {
        return repository.save(student);
    }
}
