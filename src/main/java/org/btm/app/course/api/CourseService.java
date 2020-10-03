package org.btm.app.course.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicsId) {
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicsId(topicsId)
		.forEach(courses::add);
		return courses;
	}
	public Course getCourses(String id) {
		return courseRepository.findOne(id);
	}
	public void addCourses(Course course) {
		courseRepository.save(course);
		
	}
	public void updateCourses(Course course) {
		courseRepository.save(course);
		
	}
	public void deleteCourses(String id) {
		
		courseRepository.delete(id);
	}
}
