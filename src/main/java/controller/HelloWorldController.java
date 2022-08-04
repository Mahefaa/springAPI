package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String hi(){
        return "hello world";
    }
    @GetMapping({"/hello/{name}","/hello"})
    public String Hello(@PathVariable(required = false) String name){
        if (name == null) {
            return "Hello noName";
        }
        return "Hello"+name;
    }
}
