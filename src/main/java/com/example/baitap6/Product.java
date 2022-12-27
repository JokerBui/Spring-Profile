package com.example.baitap6;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("product")
public class Product {
    public  Product(){
        System.out.println(" product ");
    }
}
