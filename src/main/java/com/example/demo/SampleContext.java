package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleContext {

    @Autowired
    SampleAutoWired sampleAutoWired;



    public void test(){

        sampleAutoWired.tester();
    }
}
