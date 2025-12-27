package com.smartdine.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tableNo;
    private double total;
    private String status; // NEW, PREPARING, READY

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> items;
}
