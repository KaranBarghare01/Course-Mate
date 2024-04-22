package com.springret.springrest.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.springret.springrest.entities.Course;

public interface ICourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course deleteCourse(long l);

	public Course updateCourse(Course course);
}
