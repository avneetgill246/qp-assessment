package com.ques.assesm.GroceryBooking.service;

import org.springframework.stereotype.Service;

import com.ques.assesm.GroceryBooking.Dto.BaseResponseDto;
import com.ques.assesm.GroceryBooking.entity.Order;

@Service
public interface OrderService {
    public BaseResponseDto createOrder(Order order);
    public BaseResponseDto updateOrder(Order order);
}
