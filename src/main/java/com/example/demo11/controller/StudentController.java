package com.example.demo11.controller;

import com.example.demo11.model.Student;
import com.example.demo11.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")


public class StudentController {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/city")
    public Optional<Student> getStudentByCity(@RequestParam String city) {
        return studentService.getStudentByCity(city);
    }


}
