package com.microservice.megha;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retriveAllCourse(){
        return Arrays.asList(
                new Course(1,"Maths","Guru"),
                new Course(2,"Science","Megha")
        );
    }
}
