package com.javohir.task1.prejection;

import com.javohir.task1.entity.Currency;
import com.javohir.task1.entity.Input;
import com.javohir.task1.entity.Supplier;
import com.javohir.task1.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Date getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
}
