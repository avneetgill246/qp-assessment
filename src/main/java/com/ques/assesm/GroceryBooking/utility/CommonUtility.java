package com.ques.assesm.GroceryBooking.utility;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.ques.assesm.GroceryBooking.Dto.BaseResponseDto;

@Component
public class CommonUtility {
    
    public BaseResponseDto assembBaseResponseDto(Set<String> violations){
        BaseResponseDto baseResponseDto=new BaseResponseDto();
        if (!violations.isEmpty()) {
            baseResponseDto.setSuccess(false);
            baseResponseDto.setMessage(String.join("\n", violations));
            baseResponseDto.setErrorType(403);
           }else{
            baseResponseDto.setSuccess(true);
            baseResponseDto.setMessage("Entity Saved");
            baseResponseDto.setErrorType(200);
           }
           return baseResponseDto;
    }
}
