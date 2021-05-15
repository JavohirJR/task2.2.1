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
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Currency currency;

    private String factureNumber;

    @Column(unique = true, nullable = false)
    private String code;

    public Output(Date date, Warehouse warehouse, Client client, Currency currency, String factureNumber, String code) {
        this.date = date;
        this.warehouse = warehouse;
        this.client = client;
        this.currency = currency;
        this.factureNumber = factureNumber;
        this.code = code;
    }

}
