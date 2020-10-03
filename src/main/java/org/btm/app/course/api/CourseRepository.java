package org.btm.app.course.api;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{
public List<Course> findByTopicsId(String topicsId);

}
