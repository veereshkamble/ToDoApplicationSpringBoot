package com.veereshkamble.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Veeresh Kamble
 * Date: 2019-11-17
 * Time: 14:49
 */

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList();
    private static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "veereshkamble", "Learn Violin", new Date(), false));
        todos.add(new Todo(++idCounter, "veereshkamble", "Learn Angular", new Date(), false));
        todos.add(new Todo(++idCounter, "veereshkamble", "Learn SpringBoot Microservices", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }
}
