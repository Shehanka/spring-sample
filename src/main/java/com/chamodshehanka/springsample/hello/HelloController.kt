package com.chamodshehanka.springsample.hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author chamodshehanka on 3/6/2019
 * @project spring-sample
 */
@RestController
class HelloController {

    @RequestMapping("/hello")
    fun sayH1(): String {
        return "Hi"
    }

}
