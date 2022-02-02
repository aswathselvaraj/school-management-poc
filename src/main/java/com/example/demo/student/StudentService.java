package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class StudentService {
    //private List<Student> studentList = Arrays.asList(new Student(1, "Arun", LocalDate.of(2000, Month.JANUARY, 2), 21, "abc@gmail.com"));
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudents() {
            return studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

}

