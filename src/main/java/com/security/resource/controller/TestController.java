package com.security.resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    //@Secured("USER")
    @RequestMapping("/test")
    public String test() {
        return "Hello World";
    }

    //@PreAuthorize("#oauth2.clientHasRole('ADMIN')")
    //@Secured("ADMIN")
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/admintest")
    public String adminTest() {
        return "Admin part";
    }
}
