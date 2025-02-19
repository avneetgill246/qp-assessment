package com.ques.assesm.GroceryBooking.controller;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ques.assesm.GroceryBooking.Dto.BaseResponseDto;
import com.ques.assesm.GroceryBooking.entity.Item;
import com.ques.assesm.GroceryBooking.entity.User;
import com.ques.assesm.GroceryBooking.service.InventoryService;
import com.ques.assesm.GroceryBooking.service.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController("/user")
public class CustController {
    
    private final UserService userService;
    private final InventoryService inventoryService;

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user){
       BaseResponseDto baseResponseDto= this.userService.createUser(user);
       return new ResponseEntity<>(baseResponseDto.getMessage(),HttpStatusCode.valueOf(baseResponseDto.getErrorType()));
    }

    @GetMapping("/find")
    public ResponseEntity<List<Item>> findAllAvailableInventory(){
        return this.inventoryService.findAllAvailableInventory();
    }
}
