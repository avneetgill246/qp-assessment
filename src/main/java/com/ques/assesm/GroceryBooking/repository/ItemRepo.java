package com.ques.assesm.GroceryBooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ques.assesm.GroceryBooking.entity.Item;

public interface ItemRepo extends JpaRepository<Item,String> {
    
    @Query("select u from Item u where u.itemQuantity <> 0")
    public List<Item> findAllAvailableInventory();
}
