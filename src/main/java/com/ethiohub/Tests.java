package com.ethiohub;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by addis on 4/11/17.
 */
@RestController
@RequestMapping("/app")
public class Tests {

    @RequestMapping("/hello")
    public String hello(){
        return "hello project";
    }
}
