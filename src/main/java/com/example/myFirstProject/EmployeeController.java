package com.example.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import com.example.myFirstProject.Employee;

@RestController
public class EmployeeController {
    @GetMapping("employee")
    public List<Employee> data() {
        List<Employee> obj = new ArrayList<Employee>();
        int id=1;
        String name="leena";
        float salary=10000f;
        obj.add(new Employee(id,name,salary));
        return obj;
    }



}
