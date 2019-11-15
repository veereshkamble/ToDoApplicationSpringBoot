package com.veereshkamble.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(method= RequestMethod.GET, path="/hello-world")
    public String HelloWorld() {
        return "Hello World";
    }
}
