package com.veereshkamble.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Veeresh Kamble
 * Date: 2019-11-14
 * Time: 21:32
 */
//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {


    @GetMapping(path="/hello-world")
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean HelloWorldBean() {
            return new HelloWorldBean("Hello World Changed");
    }

    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean HelloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
