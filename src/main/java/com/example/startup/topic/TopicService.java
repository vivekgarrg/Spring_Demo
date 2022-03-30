package com.example.startup.topic;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<topic> list =new ArrayList<>(Arrays.asList(
			new topic("vivek",21),
			new topic("bantu",18),
			new topic("hello",1)
			));
	
	public List<topic> getAllTopics(){
		return list;
	}
	public topic getTopic(String name) {
		return list.stream().filter(t->t.getName().equals(name)).findFirst().get();
	}
	public void addTopic(topic top) {
	   list.add(top);
		
	}
	public void updateTopic(String name, topic top) {
		for(int i=0; i<list.size(); i++) {
			topic t = list.get(i);
			if(t.getName().equals(name))
			{
				list.set(i, top);
			}
		}
		
	}
	public void deleteTopic(String name) {
		for(int i=0; i<list.size();i++) {
			topic t = list.get(i);
			if(t.getName().equals(name)) {
				list.remove(i);
			}
		}
	}

}
