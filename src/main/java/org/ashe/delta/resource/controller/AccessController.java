package org.ashe.delta.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
public class AccessController {

    @GetMapping("/hello")
    public String hello () {
        return "welcome to access world";
    }
}
