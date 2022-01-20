package com.example.Student_Management_System.repository;

import com.example.Student_Management_System.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Long> {

}
