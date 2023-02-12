package com.example.Universityeventmanagement.service;

import com.example.Universityeventmanagement.model.Student;
import com.example.Universityeventmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(Student student){
        studentRepository.save(student);
    }
    @Override
    public void updateStudentDepartment(int id,String department){
        Student student1=studentRepository.findById(id).get();
        student1.setDepartment(department);
        studentRepository.save(student1);
    }

    @Override
    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Integer id){
        return studentRepository.findById(id).get();
    }
}
