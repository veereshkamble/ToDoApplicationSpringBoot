package com.veereshkamble.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: Veeresh Kamble
 * Date: 2019-12-08
 * Time: 14:12
 */
public class BCryptEncoderTest {

    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        for(int i = 0; i < 10; i++) {
            String encodedString = encoder.encode("password");
            System.out.println(encodedString);
        }
    }
}
