package com.example.democlientdiscovery.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClientController {
    @GetMapping("/services/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String get(@PathVariable String name) {
        return "Service name is " + name;
    }
}
