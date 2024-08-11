package com.example.springboot.service;

import com.example.springboot.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentByID(Long id);
    void deleteStudent(Long id);
}
