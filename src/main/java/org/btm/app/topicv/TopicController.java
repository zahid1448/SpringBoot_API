package org.btm.app.topicv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;
	@RequestMapping("/topics")
	public List<Topics> getAllTopics(){
		return topicservice.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Topics getTopics(@PathVariable String id){
		return topicservice.getTopics(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopics(@RequestBody Topics topics){
		topicservice.addTopics(topics);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopics(@RequestBody Topics topics,@PathVariable String id){
		topicservice.updateTopics(id,topics);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopics(@PathVariable String id){
		 topicservice.deleteTopics(id);
}
}