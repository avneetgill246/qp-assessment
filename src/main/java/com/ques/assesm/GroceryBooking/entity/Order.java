package com.ques.assesm.GroceryBooking.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Table(name="USER_ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private String orderId;
    private boolean currentOrder;
    private BigDecimal totalAmount;
    @ManyToOne
    @JoinColumn(name="userId")
    private User user;
    @OneToMany
    @JoinColumn(name="orderId")
    private List<OrderItems> orderItems;

}
