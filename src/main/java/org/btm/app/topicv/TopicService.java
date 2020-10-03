package org.btm.app.topicv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topics> getAllTopics() {
		List<Topics> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	public Topics getTopics(String id) {
		return topicRepository.findOne(id);
	}
	public void addTopics(Topics topics) {
		topicRepository.save(topics);
		
	}
	public void updateTopics(String id, Topics topics) {
		topicRepository.save(topics);
		
	}
	public void deleteTopics(String id) {
		
		topicRepository.delete(id);
	}
}
