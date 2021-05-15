package com.javohir.task1.prejection;

import com.javohir.task1.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    String getPhoneNumber();

}
