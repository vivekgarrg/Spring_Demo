package com.example.startup.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<topic> getAllTopic() {
		return  topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{name}")
	public topic getTopic(@PathVariable String name) {
	 return topicService.getTopic(name);	
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody topic top) {
		topicService.addTopic(top);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{name}")
	public void updateTopic(@RequestBody topic top,@PathVariable String name) {
		topicService.updateTopic(name,top);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{name}")
	public void deleteTopic(@PathVariable String name) {
	  topicService.deleteTopic(name);	
	}


}
