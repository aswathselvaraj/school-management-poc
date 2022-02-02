package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="api/vi/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void saveStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

} 
