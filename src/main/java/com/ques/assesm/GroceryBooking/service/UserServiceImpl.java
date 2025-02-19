package com.ques.assesm.GroceryBooking.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ques.assesm.GroceryBooking.Dto.BaseResponseDto;
import com.ques.assesm.GroceryBooking.entity.User;
import com.ques.assesm.GroceryBooking.repository.UserRepo;
import com.ques.assesm.GroceryBooking.utility.CommonUtility;
import com.ques.assesm.GroceryBooking.validators.DefaultValidator;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService{
    
    private final UserRepo userRepo;
    private final DefaultValidator<User> userValidator;
    private final CommonUtility utility;

    @Autowired
    UserServiceImpl(UserRepo userRepo,DefaultValidator<User> userValidator,CommonUtility utility){
        this.userRepo=userRepo;
        this.userValidator=userValidator;
        this.utility=utility;
    }

    @Override
    @Transactional
    public BaseResponseDto createUser(User user){
        Set<String> violations=this.userValidator.validate(user);
        if (violations.isEmpty()) {
            this.userRepo.save(user);
           }
        return this.utility.assembBaseResponseDto(violations); 
    }   

    @Override
    @Transactional
    public BaseResponseDto updateUser(User user){
        Set<String> violations=this.userValidator.validate(user);
        if (violations.isEmpty()) {
            this.userRepo.save(user);
           }
        return this.utility.assembBaseResponseDto(violations); 
    }   

    @Override
    @Transactional
    public BaseResponseDto removeUser(User user){
        Set<String> violations=this.userValidator.validate(user);
        if (violations.isEmpty()) {
            this.userRepo.save(user);
           }
        return this.utility.assembBaseResponseDto(violations); 
    }   
}
