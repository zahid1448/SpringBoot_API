package org.btm.app.course.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.btm.app.topicv.Topics;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Course {
	@Id
private String id;
private String name;
private String description;
@ManyToOne
private Topics topics;

public Course() {
	
}
public Course(String id,String name,String description,String topicsId) {
	super();
	this.id=id;
	this.name=name;
	this.description=description;
	this.topics=new Topics(topicsId,"","");
}

public Topics getTopics() {
	return topics;
}
public void setTopics(Topics topics) {
	this.topics = topics;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
