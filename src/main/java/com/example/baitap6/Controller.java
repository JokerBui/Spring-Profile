package com.example.baitap6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    MyApplication myApplication;
    @GetMapping("/")
    public String welcome(){
        return myApplication.getMessage();
    }
}
