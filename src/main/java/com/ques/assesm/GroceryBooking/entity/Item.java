package com.ques.assesm.GroceryBooking.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Table(name="INVENTORY")
public class Item {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private String itemId;
    private String itemName;
    private BigDecimal itemPrice;
    private BigDecimal itemQuantity;

}
