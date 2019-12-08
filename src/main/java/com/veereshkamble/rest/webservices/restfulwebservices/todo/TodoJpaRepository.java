package com.veereshkamble.rest.webservices.restfulwebservices.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Veeresh Kamble
 * Date: 2019-12-08
 * Time: 15:22
 */
@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {

    List<Todo> findByUsername(String username);
}
