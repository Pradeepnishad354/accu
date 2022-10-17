package com.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.course.entity.Course;

@Service
public interface CourseService {
	
	public Course saveCourse(Course course);
	
	public Course getCourse(int  id);
	
	public List<Course> getAllCourse();
	
	public void deleteCourse(int id);
	
	public Course updateCourse(Course course ,int id);
	

}
