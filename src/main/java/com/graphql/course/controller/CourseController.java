package com.graphql.course.controller;

import com.graphql.course.model.Course;
import com.graphql.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @QueryMapping(name = "findAllQuery")
    public List<Course> getAllCourse() {
        return courseService.getAllCourses();
    }

    @MutationMapping(name = "addCourse")
    public Course saveCourse(@Argument Course course) {
        return courseService.addCourse(course);
    }

}
