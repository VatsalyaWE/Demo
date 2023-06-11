package com.example.demo.A.controller;

import com.example.demo.B.B1.controller.B1Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class AController {

    @Autowired
    private B1Interface b1Interface;

    @GetMapping()
    public String someFunction(){
        return b1Interface.checkSomething();
    }

}
