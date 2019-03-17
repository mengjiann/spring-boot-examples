package com.mj.spring_boot.rest_docs.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name",required = false) String name){
        return new StringBuilder()
                    .append("Hello ")
                    .append((name == null || name.isEmpty()) ? " world" : name)
                    .toString();
    }

}
