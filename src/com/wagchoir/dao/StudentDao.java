package com.wagchoir.dao;

import com.wagchoir.domain.Student;
import com.wagchoir.vo.StudentAndClassroomVO;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public Student getById(String id);
    public void save(Student s);

    List<Student> getAllStudents();

    Student selectStu(String s);

    List<Student> selectList(int age);

    Student select2(Student student);

    Student select3(Map<String, Object> map);

    List<Student> select6(String c);

    List<String> select8();

    List<Map<String, Object>> select9();

    List<Map<String, Object>> select10();

    List<Student> select18(Student stu1);

    List<Student> select19(String[] ids);

    Student select20(String s);

    List<Map<String, Object>> select21();

    List<StudentAndClassroomVO> select22(String s);
}
