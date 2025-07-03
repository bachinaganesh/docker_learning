package com.example.springboot_docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_docker.dtos.StudentRequest;
import com.example.springboot_docker.models.Student;
import com.example.springboot_docker.service.StudentService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("")
    public ResponseEntity<Student> createStudent(@RequestBody StudentRequest studentRequest) {
        Student student = this.studentService.createStudent(studentRequest);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = this.studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    
    
    
}
