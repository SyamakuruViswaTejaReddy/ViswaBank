package com.example.PrimaryQualifierdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    @Qualifier("desktop")
    private Computer computer;

    public Dev(){
        System.out.println("Dev object created");
    }

    public void code() {
        computer.code();
    }
}
