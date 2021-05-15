package com.javohir.task1.prejection;

import com.javohir.task1.entity.InputProduct;
import com.javohir.task1.entity.Output;
import com.javohir.task1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Output getInput();


}
