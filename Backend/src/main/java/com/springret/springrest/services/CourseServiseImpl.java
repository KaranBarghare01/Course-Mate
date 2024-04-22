package com.springret.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springret.springrest.entities.Course;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class CourseServiseImpl implements ICourseService {

//	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiseImpl() {
		
//		list = new ArrayList();
//		list.add(new Course(125, "Java core", "This course teach basics of Java"));
//		list.add(new Course(1524, "Spring Boot", "Creating web services"));
	}
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null;
//		
//		for(Course course : list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
//		
//		return c;
		Course course = courseDao.getOne(courseId);
		return course;
	}

	@Override
	public Course addCourse(Course course) {

//		list.add(course);
//		
//		return course;
		courseDao.save(course);
		return course;
	}

	@Override
	public Course deleteCourse(long courseId) {
		
//		Course co = null;
//		
//		for(Course course : list)
//		{
//			if(course.getId()==courseId)
//			{
//				co = course;
//				list.remove(course);
//				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
//			}
//		}
//		return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
		return entity;
	}

	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e -> {
//			if(e.getId()==course.getId())
//			{
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;
		
		courseDao.save(course);
		return course;
	}

}
