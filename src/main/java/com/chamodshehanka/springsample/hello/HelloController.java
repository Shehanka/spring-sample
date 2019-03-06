package com.chamodshehanka.springsample.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chamodshehanka on 3/6/2019
 * @project spring-sample
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayH1(){
        return "Hi";
    }

}
