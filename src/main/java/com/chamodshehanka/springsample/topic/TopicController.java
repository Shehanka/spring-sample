package com.chamodshehanka.springsample.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chamodshehanka on 3/6/2019
 * @project spring-sample
 **/
@RestController
public class TopicController {

    @RequestMapping("/topics")
    public String getAllTopics(){
        return "All Topics";
    }

}
