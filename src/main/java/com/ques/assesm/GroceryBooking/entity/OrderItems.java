package com.ques.assesm.GroceryBooking.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Table(name="ORDER_ITEMS")
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderItemId;
    @ManyToOne
    @JoinColumn(name="orderId")
    private Order order;
    @OneToOne
    @JoinColumn(name="itemId")
    private Item item;
    private BigDecimal soldPrice;
    private BigDecimal quantity;
 
}
