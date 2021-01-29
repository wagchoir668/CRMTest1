package com.wagchoir.test;

import com.wagchoir.dao.StudentDao;
import com.wagchoir.domain.Student;
import com.wagchoir.util.SqlSessionUtil;
import com.wagchoir.vo.StudentAndClassroomVO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        StudentDao dao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

//        Student stu1 = new Student();
//        stu1.setName("c");
//        stu1.setAddress("D");
//        List<Student> list = dao.select18(stu1);
//        for(Student stu:list)
//        {
//            System.out.println(stu);
//        }

//        String[] ids = {"1001","1874","7788"};
//        List<Student> list = dao.select19(ids);
//        for(Student stu:list)
//        {
//            System.out.println(stu);
//        }

//        Student stu1 = dao.select20("7788");
//        System.out.println(stu1);

//        List<Map<String,Object>> list = dao.select21();
//        for(Map<String,Object> map:list)
//        {
//            Set<String> keys = map.keySet();
//            for(String key:keys)
//            {
//                System.out.println(key+"--"+map.get(key));
//            }
//            System.out.println("----------");
//        }

        List<StudentAndClassroomVO> list = dao.select22("c");
        for(StudentAndClassroomVO vo:list)
        {
            System.out.println(vo);
        }

//        Student stu = dao.selectStu("8879");
//        System.out.println(stu);

//        List<Student> list = dao.selectList(23);
//        for(Student s:list)
//        {
//            System.out.println(s);
//        }

        Student student2 = new Student();
        student2.setAge(23);
        student2.setName("ljj");
//        Student s2 = dao.select2(student2);
//        System.out.println(s2);

//        Map<String,Object> map = new HashMap<>();
//        map.put("name","tzz");
//        map.put("age",23);
//        Student s3 = dao.select3(map);
//        System.out.println(s3);

//        List<Student> studentList = dao.select6("c");
//        for(Student student:studentList){
//            System.out.println(student);
//        }

//        List<String> name = dao.select8();
//        for(String n:name)
//        {
//            System.out.println(n);
//        }

//        List<Map<String,Object>> list = dao.select9();
//        for(Map<String,Object> map:list)
//        {
//            Set<String> keys = map.keySet();
//            for(String key:keys)
//            {
//                System.out.println(key+"--"+map.get(key));
//            }
//            System.out.println("----------------");
//        }

//        List<Map<String,Object>> list = dao.select10();
//        for(Map<String,Object> map:list)
//        {
//            Set<String> keys = map.keySet();
//            for(String key:keys)
//            {
//                System.out.println(key+"--"+map.get(key));
//            }
//            System.out.println("-----");
//        }

    }
}
