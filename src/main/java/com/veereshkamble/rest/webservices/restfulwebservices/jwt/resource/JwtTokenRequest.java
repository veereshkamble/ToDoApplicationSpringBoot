package com.veereshkamble.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Veeresh Kamble
 * Date: 2019-12-07
 * Time: 21:29
 */
public class  JwtTokenRequest implements Serializable {

  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

//    {
////        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU3NjM4OTcxMCwiaWF0IjoxNTc1Nzg0OTEwfQ.fhJEEIhbinFZ88uLtpRuihJAkCLiPhv6xr432XYrDu1Gqye24oRvtC0fixNO59SP2PoVFjzOL5Ce_fr65whU9g"
////    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
