package com.anupriyam.simpleexampleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles GET requests to the "/hello" endpoint.
 *
 * @return a welcome message confirming the application is running.
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot";
    }

}
