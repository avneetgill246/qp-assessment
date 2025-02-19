package com.ques.assesm.GroceryBooking.Dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Component
public class BaseResponseDto {
    
    public boolean isSuccess;
    public String message;
    public int errorType; 
}
