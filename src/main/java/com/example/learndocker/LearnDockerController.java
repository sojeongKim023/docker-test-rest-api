package com.example.learndocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnDockerController {

    @GetMapping("/test")
    public String test(String test){
        return test+" HIHI DOCKER";
    }

    @GetMapping("/name")
    public String name(String name){
        return "Hi My name is "+name+" !";
    }

    @GetMapping("/age")
    public String age(String age){
        return "I`m "+age+" years old";
    }

    @GetMapping("/hi")
    public String hi(String hi){
        return "HIHI ="+"Hi";
    }



}
