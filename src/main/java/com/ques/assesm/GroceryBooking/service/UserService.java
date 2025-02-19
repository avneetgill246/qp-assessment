package com.ques.assesm.GroceryBooking.service;

import org.springframework.stereotype.Service;

import com.ques.assesm.GroceryBooking.Dto.BaseResponseDto;
import com.ques.assesm.GroceryBooking.entity.User;

@Service
public interface UserService {
    public BaseResponseDto createUser(User user);
    public BaseResponseDto removeUser(User user);
    public BaseResponseDto updateUser(User user);
}
