package com.example.PrimaryQualifierdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop implements Computer {
    public void code(){
        System.out.println("Coding on Laptop");
    }
}
