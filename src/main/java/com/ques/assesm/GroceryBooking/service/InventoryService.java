package com.ques.assesm.GroceryBooking.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ques.assesm.GroceryBooking.Dto.BaseResponseDto;
import com.ques.assesm.GroceryBooking.entity.Item;

@Service
public interface InventoryService {
    public BaseResponseDto createItem(Item item);
    public BaseResponseDto updateItem(Item item);
    public BaseResponseDto deleteItem(Item item);
    public ResponseEntity<List<Item>> findAllAvailableInventory();
}
