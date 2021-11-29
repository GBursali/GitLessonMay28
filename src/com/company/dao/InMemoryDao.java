package com.company.dao;

import com.company.model.Student;

import java.util.*;

//ahmet dellal
public class InMemoryDao {
    private final Map<Long, Student> studentMap = new HashMap<>();

    public InMemoryDao() {
        Student student = new Student("Ahmet", "DELLAL");
        studentMap.put(1L, student);
    }

    public void create(Student student) {
        studentMap.put(new Date().getTime(), student);
    }

    public Student getStudentByName(String name) {
        return studentMap.values().stream()
                .filter(student -> student.getName().equals(name))
                .findAny().orElse(null);
    }

    public List<Student> getAllStudent() {
        return new ArrayList<>(studentMap.values());
    }
   
    public void getStringExample(){
	System.out.println("Merhaba dunya");
    }
}
