package com.backendproject.edumy.Controller;

import com.backendproject.edumy.Entities.Course;
import com.backendproject.edumy.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CourseController {
   @Autowired private CourseService courseService;
   @PostMapping("/saveCourse")
   public Course saveCourse(@RequestBody Course course)
   {
       return courseService.saveCourse(course);
   }
   @GetMapping("/getCourse")
    public List<Course>fetchCourse(Course course)
   {
       return courseService.fetchCourseList();
   }
   @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable("id") Long courseId )
   {
       courseService.deleteCourse(courseId);
   }
}
