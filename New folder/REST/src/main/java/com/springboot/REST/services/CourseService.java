package com.springboot.REST.services;

import java.util.List;

import com.springboot.REST.entity.Course;

public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourses(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);

}
