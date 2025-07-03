package com.example.springboot_docker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot_docker.dtos.StudentRequest;
import com.example.springboot_docker.models.Student;
import com.example.springboot_docker.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(StudentRequest studentRequest) {
        Student student = new Student();
        student.setStudentName(studentRequest.getStudentName());
        student.setGender(studentRequest.getGender());
        student.setStudentAddress(studentRequest.getStudentAddress());

        return this.studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }
}   
