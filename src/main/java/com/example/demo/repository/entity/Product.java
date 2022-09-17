package com.example.demo.repository.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "name")
    private Long id;

    @Column(name = "price")
    private Long price;

    @Column(name = "status")
    private ProductStatus status;

    @Column(name = "created_at")
    private Timestamp created_at;

    public enum ProductStatus{
        OUT_OF_STOCK,
        IN_STOCK,
        RUNNING_LOW
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(price, product.price) && status == product.status && Objects.equals(created_at, product.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, status, created_at);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", status=" + status +
                ", created_at=" + created_at +
                '}';
    }
}
