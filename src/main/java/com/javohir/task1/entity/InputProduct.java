package com.javohir.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InputProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Product product;

    @Column(nullable = false)
    private Double amount;

    private Double price;

    private Date expireDate;

    @ManyToOne
    private Input input;

    public InputProduct(Product product, Double amount, Double price, Date expireDate, Input input) {
        this.product = product;
        this.amount = amount;
        this.price = price;
        this.expireDate = expireDate;
        this.input = input;
    }
}
