package com.ques.assesm.GroceryBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ques.assesm.GroceryBooking.entity.Order;

public interface OrderRepo extends JpaRepository<Order,String>{
    
}
