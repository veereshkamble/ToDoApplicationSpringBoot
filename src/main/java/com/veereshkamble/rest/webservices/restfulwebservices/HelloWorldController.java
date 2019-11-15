package com.veereshkamble.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Veeresh Kamble
 * Date: 2019-11-14
 * Time: 21:32
 */
//Controller
@RestController
public class HelloWorldController {

    // GET
    // URI - /hello-world
    // method - "Hello World"
    @GetMapping(path="/hello-world")
    public String HelloWorld() {
        return "Hello World";
    }

    //hello-world-bean
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean HelloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
}
