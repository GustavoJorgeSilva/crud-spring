package com.home.crudspring.controller;

import com.home.crudspring.models.Courses;
import com.home.crudspring.repository.CourseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public List<Courses> list() {
        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Courses create(@RequestBody Courses course) {
        //System.out.println(course.getName());
        return courseRepository.save(course);
      //return ResponseEntity.status(HttpStatus.CREATED).body(courseRepository.save(course));

    }


}
