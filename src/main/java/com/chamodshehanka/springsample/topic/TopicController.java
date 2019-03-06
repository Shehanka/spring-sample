package com.chamodshehanka.springsample.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chamodshehanka on 3/6/2019
 * @project spring-sample
 **/
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{topicID}")
    public Topic getTopic(@PathVariable String topicID){
        return topicService.getTopic(topicID);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicID}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String topicID){
        topicService.updateTopic(topicID, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicID}")
    public void deleteTopic(@PathVariable String topicID){
        topicService.deleteTopic(topicID);
    }

}
