package com.example.demo.B.B2.controller;

import com.example.demo.B.B1.controller.B1Interface;
import org.springframework.stereotype.Service;

@Service
public class B2Controller implements B1Interface {

    public String checkSomething(){
        return "hello";
    }
}
