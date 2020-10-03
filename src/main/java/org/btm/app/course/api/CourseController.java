package org.btm.app.course.api;
import java.util.List;
import org.btm.app.topicv.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseservice;
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseservice.getAllCourses(id);
	}
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourses(@PathVariable String id){
		return courseservice.getCourses(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addCourses(@RequestBody Course course,@PathVariable String topicId){
		course.setTopics(new Topics(topicId,"",""));
		courseservice.addCourses(course);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public void updateCourses(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id){
		course.setTopics(new Topics(topicId,"",""));
		courseservice.updateCourses(course);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{id}")
	public void deleteCourses(@PathVariable String id){
		 courseservice.deleteCourses(id);
}
}