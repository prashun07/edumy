package com.backendproject.edumy.Service;

import com.backendproject.edumy.Entities.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);
    List<Course>fetchCourseList();
    void deleteCourse(Long CourseId);
}
