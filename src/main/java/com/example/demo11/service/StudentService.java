package com.example.demo11.service;

import com.example.demo11.model.Student;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface StudentService {
    Optional<Student> getStudentById(Long id);
    Optional<Student> getStudentByCity(String city);
}
