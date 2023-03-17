package com.springapp.demoapp.mydemorest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    
    //Return the "hello world"
    @GetMapping("/helloWorld")
    public String sayHello()
    {
        return "hello wolrd";
    }
}
