package com.ques.assesm.GroceryBooking.service;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ques.assesm.GroceryBooking.entity.Item;
import com.ques.assesm.GroceryBooking.repository.ItemRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InventoryServiceImpl implements InventoryService{
    
    private final ItemRepo itemRepo;

    @Override
    public ResponseEntity<List<Item>> findAllAvailableInventory(){
        List<Item> availInvent=this.itemRepo.findAllAvailableInventory();
        if (availInvent !=null && availInvent.size()>0) {
            return new ResponseEntity<List<Item>>(availInvent,HttpStatusCode.valueOf(200));
        }else{
            return new ResponseEntity<List<Item>>(HttpStatusCode.valueOf(403));
        }

    }
}
