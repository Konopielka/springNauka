package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engine engine;

//    public Car(Engine engine){      //KONSTRUKTOR
//        this.engine = engine;
//    }
//    @Autowired
//    public void setEngine(Engine engine){    //SETTER
//        this.engine = engine;
//    }
}
