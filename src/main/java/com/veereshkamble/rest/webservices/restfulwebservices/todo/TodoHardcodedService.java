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
        todos.add(new Todo(++idCounter, "veereshkamble", "Learn Angular 7", new Date(), false));
        todos.add(new Todo(++idCounter, "veereshkamble", "Learn SpringBoot Microservices", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);

        if(todo == null) return null;

        if(todos.remove(todo)) {
            return todo;
        }
        return null;
    }

    public Todo findById(long id) {
        for(Todo todo : todos) {
            if(todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }
}
