package com.example.baitap6;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Dev {
    public  Dev(){
        System.out.println(" dev ");
    }
}
