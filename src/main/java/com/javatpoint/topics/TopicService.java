package com.javatpoint.topics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List<Topic> topics=new ArrayList<> (Arrays.asList
				(
						new Topic("spring1","spring framework","description"),
						new Topic("spring2","spring framework","description"),
						new Topic("spring3","spring framework","description")
						));
				
	
	
	public List<Topic> getAll(){
		return topics;
	}
	
	
	public Topic getOne(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	 public void updateTopic(Topic topic, String id) {
		 for(int i=0;i< topics.size();i++) {
			 Topic t=topics.get(i);
			 if(t.getId().equals(id)) {
				 topics.set(i, topic);
				 return ;
			 }
		 }
	 }
	 
	 
	public void deleteTopic(String id) {
		topics.removeIf(t-> t.getId().equals(id));
	}
	
	
	

}
