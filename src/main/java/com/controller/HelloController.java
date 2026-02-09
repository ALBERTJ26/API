package com.controller;

//package com.example.demoAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello executed");
        return "Hello from Spring Boot API 🚀";
    }
    
    @GetMapping("/helloa")
    public String helAPIlo() {
        System.out.println("Hello executed");
        return "Testingggggggggg";
        
    }
    
    // Method inga thaan create pannanum each method each API 
    // For Example /Lara method la oru SQL query use panni data collect pannitu varalam 
    // Select * from table_name -> data varum atha some entity use panni data pass pannalam
   @GetMapping("/Lara")
   public String pappu() {
//	   name, age, place
//	   albert, 24, chennai
//	   [
//	    {
//	    	name: "albert",
//	    	age: "24",
//	    	place: "chennai"
//	    }
//	    ]
	   return"100";
	   
   }
    
}
