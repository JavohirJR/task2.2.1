package com.javohir.task1.prejection;

import com.javohir.task1.entity.Output;
import com.javohir.task1.entity.OutputProduct;
import com.javohir.task1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Output getOutput();

}
