package com.example.demo.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "order_items")
public class Order_item {

    @Column(name = "order_id")
    private Long order_id;

    @Column(name = "product_id")
    private String product_id;

    @Column(name = "quantity")
    private String quantity;
}
