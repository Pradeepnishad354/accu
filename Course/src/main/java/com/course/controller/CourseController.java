package com.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.entity.Course;
import com.course.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/courses")
	public Course saveCourse(@RequestBody Course course) {
		
		return courseService.saveCourse(course);
	
	}
	
	@GetMapping("/courses/{id}")
	public Course getCourseById(@PathVariable("id") int id) {
		
	return courseService.getCourse(id);
		
//	if(courseData.isPresent()) {
//		
//		new ResponseEntity<>(courseData.get(),HttpStatus.OK);
//	}else {
//		new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	}
//	
//	
//		return new ResponseEntity<Course>(HttpStatus.OK);
//		
//		
//		}catch(Exception e) {
//			
//			return new ResponseEntity<Course>(HttpStatus.NO_CONTENT);
//		}
		
		
	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourse(){
		
		return courseService.getAllCourse();
		
		
	}
	
	@DeleteMapping("/courses/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int id){
		try {
		 courseService.deleteCourse(id);
		 return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch(Exception e){
			
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}	
		}
	
	@PutMapping("/courses/{id}")
	public Course updateCourse(@RequestBody Course course ,@PathVariable("id")  int id) {
		
	return 	courseService.updateCourse(course, id);
		
		
	
	}

}
