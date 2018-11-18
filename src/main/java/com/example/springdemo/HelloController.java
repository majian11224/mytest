package com.example.springdemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/helllo", method = RequestMethod.GET)
    public String sayHello() {
        return "你好！";
    }
}