package com.example.springboot_docker.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

    private String studentName;
    private String gender;
    private String studentAddress;

}
