package com.demo.Springsecurity.Controller;

import com.demo.Springsecurity.Model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
//@RequestMapping("/Employee")
public class EmployeeController {



//    @RequestMapping("/All")
//    public List<Employee> getAllEmployee(){
//
//        List<Employee>getAll = new ArrayList<>(Arrays.asList(new Employee("Sundaram",20,30000),
//                new Employee("Shreya",20,30000),
//                new Employee("Satyam",20,30000),
//                new Employee("Priyanka",20,30000)
//                                                            ));
//
//        return getAll;
//
//
//    }
    @GetMapping("/")
    public String printInfo(){
        return "<h1>My World<h1>";
    }

    @GetMapping("/user")
    public String printUser(){
        return "<h1>Welcome User<h1>";
    }

    @GetMapping("/admin")
    public String printAdmin(){
        return "<h1>Welcome Admin<h1>";
    }


}
