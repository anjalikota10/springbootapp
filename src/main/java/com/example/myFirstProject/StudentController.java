package com.example.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.myFirstProject.Student;

@RestController
public class StudentController {
    @GetMapping("student")
    public List<Student> data()
    {
      List<Student> stud=new ArrayList<Student>();
      int rollno=1;
      String name="madhu";
      float percentage= 90.89F;
      stud.add(new Student(rollno,name,percentage));
      return stud;
    }
}


