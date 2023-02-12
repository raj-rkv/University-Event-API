package com.example.Universityeventmanagement.service;

import com.example.Universityeventmanagement.model.Event;
import com.example.Universityeventmanagement.model.Student;

import java.util.List;

public interface IStudentService {
    public void addStudent(Student student);
    public void updateStudentDepartment(int id,String department);
    public void deleteStudent(int id);
    public List<Student> getAllStudent();
    public Student getById(Integer id);

}
