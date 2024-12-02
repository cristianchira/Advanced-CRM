package com.biostil.Advanced_CRM.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultRestController {
    @Value("${my.name}")
    private String name;
    
    @GetMapping("/")
    public String DefaultPage() {
        return "<h1> Welcome <span style='color:red;'>" + name + "</span> to Advanced CRM </h1>";
        
    }
}
