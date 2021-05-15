package com.javohir.task1.prejection;

import com.javohir.task1.entity.Attachment;
import com.javohir.task1.entity.Category;
import com.javohir.task1.entity.Measurement;
import com.javohir.task1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
    String getName();
    Category getCategory();
    Attachment getPhoto();
    String getCode();
    Measurement getMeasurement();

}
