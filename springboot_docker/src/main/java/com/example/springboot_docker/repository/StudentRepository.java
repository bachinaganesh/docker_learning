package com.example.springboot_docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_docker.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
