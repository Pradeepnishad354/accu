package com.course.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.dao.CourseRepository;
import com.course.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
		
	}

	@Override
	public Course getCourse(int id) {
		
		return courseRepository.findById(id).get();
	}
	
	
	@Override
	public List<Course> getAllCourse() {
		
		return courseRepository.findAll();
	}

	@Override
	public void deleteCourse(int id) {
		
	Course entity=courseRepository.getReferenceById(id);
	
	courseRepository.delete(entity);
	}

	@Override
	public Course updateCourse(Course course, int id) {
		
		 Course course2 = courseRepository.findById(id).get();
		 
		if(Objects.nonNull(course.getTitle()) && ! "".equalsIgnoreCase(course.getTitle())) {
			
			course2.setTitle(course.getTitle());
		}
		
		if(Objects.nonNull(course.getDescription()) && ! "".equalsIgnoreCase(course.getDescription())) {
			
		course2.setDescription(course.getDescription());	
		}
		
		if(Objects.nonNull(course.getDuration()) && ! "".equalsIgnoreCase(course.getDuration())) {
			
			course2.setDuration(course.getDuration());
		}
		return courseRepository.save(course2);
		
	}

	

}
