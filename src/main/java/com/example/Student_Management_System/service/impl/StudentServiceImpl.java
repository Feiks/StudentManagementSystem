package com.example.Student_Management_System.service.impl;

import com.example.Student_Management_System.entity.Student;
import com.example.Student_Management_System.repository.StudentsRepository;
import com.example.Student_Management_System.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentsRepository studentsRepository;

    public StudentServiceImpl(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentsRepository.findAll();
    }
}
