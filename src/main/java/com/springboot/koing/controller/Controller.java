package com.springboot.koing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
    @RestController
    public class Conrtroller{
        @RequestMapping("/hello")
        public String hello(){
            return "Hello World";
        }
    }
}
