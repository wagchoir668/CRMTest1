package com.wagchoir.service;

import com.wagchoir.dao.StudentDao;
import com.wagchoir.domain.Student;
import com.wagchoir.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentDao studentDao =
            SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {
        Student stu = studentDao.getById(id);
        return stu;
    }

    @Override
    public void save(Student stu)
    {
        studentDao.save(stu);
    }

    @Override
    public List<Student> getAll() {
        List<Student> list = studentDao.getAllStudents();
        return list;
    }
}
