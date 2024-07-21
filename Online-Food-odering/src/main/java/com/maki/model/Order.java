package com.maki.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.maki.dto.RestaurantDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne//many orders have one customer
    private User customer;

    @JsonIgnore
    @ManyToOne // many orders from one res
    private Restaurant restaurant;

    private Long totalAmount;

    private String orderStatus;

    private Date createdAt;

    @ManyToOne //many orders coming to one adress
    private Address deliveryAddress;


    @OneToMany // one order has many items
    private List<OrderItem> orderitem;

    private int totalItem;

    private int totalPrice;


   // private int totalItem;



}
