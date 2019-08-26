package com.security.resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "Hi peasant";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/admintest")
    public String adminTest() {
        return "Welcome almighty!";
    }
}
