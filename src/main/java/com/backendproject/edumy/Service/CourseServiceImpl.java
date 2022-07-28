package com.backendproject.edumy.Service;

import com.backendproject.edumy.Entities.Course;
import com.backendproject.edumy.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
   @Autowired //Removing @Autowired can cause nullpointerexception
    CourseRepo courseRepo;

    @Override
    public Course saveCourse(Course course) {
     return courseRepo.save(course);
    }

    @Override
    public List<Course> fetchCourseList() {
        return courseRepo.findAll();
    }

    @Override
    public void deleteCourse(Long CourseId) {
      courseRepo.deleteById(CourseId);
    }
}
