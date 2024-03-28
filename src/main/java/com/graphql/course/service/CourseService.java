package com.graphql.course.service;

import com.graphql.course.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course addCourse(Course course);
}
