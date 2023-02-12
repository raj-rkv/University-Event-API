package com.example.Universityeventmanagement.controller;

import com.example.Universityeventmanagement.model.Event;
import com.example.Universityeventmanagement.model.Student;
import com.example.Universityeventmanagement.service.IEventService;
import com.example.Universityeventmanagement.service.IStudentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/university-event-app")
public class UniversityEventController {

    @Autowired
    private IEventService eventService;

    @Autowired
    private IStudentService studentService;

    @GetMapping("/")
    public String home(){
        String message="Welcome to University Event Management App";
        return message;
    }

    @PostMapping("add-student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PatchMapping("update-student-department/id/{id}/{dept}")
    public void updateStudentDepartment(@PathVariable Integer id,@PathVariable String dept){
        studentService.updateStudentDepartment(id,dept);
    }

    @DeleteMapping("delete-student/id/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }

    @GetMapping("get-all-student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("get-student-by-id/id/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.getById(id);
    }

    @PostMapping("add-event")
    public void addEvent(@RequestBody Event event){
        eventService.addEvent(event);
    }

    @PutMapping("update-event/id/{id}")
    public void updateEvent(@PathVariable Integer id,@RequestBody Event event){
        eventService.updateEvent(id,event);
    }

    @DeleteMapping("delete-event/id/{id}")
    public void deleteEvent(@PathVariable Integer id){
        eventService.deleteEvent(id);
    }

    @GetMapping("get-event-by-id/id/{id}")
    public Event getEventById(@PathVariable Integer id){
        return eventService.getById(id);
    }




}
