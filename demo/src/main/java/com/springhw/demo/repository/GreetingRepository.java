package com.springhw.demo.repository;

import com.springhw.demo.model.Greeting;

public interface GreetingRepository {
     
    int saveGreeting(Greeting greeting); 

}