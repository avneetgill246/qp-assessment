package com.ques.assesm.GroceryBooking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    
    @GetMapping("/")
    public String gettest(){
        return "Hello World";
    }
}
