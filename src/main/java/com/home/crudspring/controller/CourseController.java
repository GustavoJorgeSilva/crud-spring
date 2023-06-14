package com.home.crudspring.controller;

import com.home.crudspring.models.Courses;
import com.home.crudspring.repository.CourseRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {


    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    //@RequestMapping(method = RequestMethod.GET
    public List<Courses> list(){
        return courseRepository.findAll();
    }


}
