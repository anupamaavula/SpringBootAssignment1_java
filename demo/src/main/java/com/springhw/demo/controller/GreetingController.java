package com.springhw.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.springhw.demo.model.Greeting;
import com.springhw.demo.repository.GreetingRepository;

@Controller
public class GreetingController {


  @Autowired
  GreetingRepository greetingRepository;

  @GetMapping("/greeting")
  public String greetingForm(Model model) {
    model.addAttribute("greeting", new Greeting());
    return "greeting";
  }

  @PostMapping("/greeting")
  public String greetingSubmit(@ModelAttribute Greeting greeting) {

    // Get the Greeeting Object and check you re getting the values into greeting object.
    //System.out.println("greeting is "+greeting);
    System.out.println(" greeting.toString() : "+greeting.toString());
    
     //Call GreetingRepository.saveGreeting() to save the greeting into H2 database
     greetingRepository.saveGreeting(greeting);

    return "result";
  }

}