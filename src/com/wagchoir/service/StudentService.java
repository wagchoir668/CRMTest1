package com.wagchoir.service;

import com.wagchoir.domain.Student;

import java.util.List;

public interface StudentService {
    public Student getById(String id);

    public void save(Student stu);

    List<Student> getAll();
}
