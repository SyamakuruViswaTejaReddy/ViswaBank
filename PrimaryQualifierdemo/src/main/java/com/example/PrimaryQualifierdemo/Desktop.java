package com.example.PrimaryQualifierdemo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void code() {
        System.out.println("Coding on Desktop");
    }
}
