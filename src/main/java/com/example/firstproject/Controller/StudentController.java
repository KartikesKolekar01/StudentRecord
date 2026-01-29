package com.example.firstproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.firstproject.Entity.Student;
import com.example.firstproject.Repository.StudentRepository;
@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:5173")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public Student saveStudent(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
