package com.javohir.task1.prejection;

import com.javohir.task1.entity.Currency;
import com.javohir.task1.entity.Output;
import com.javohir.task1.entity.Supplier;
import com.javohir.task1.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Date getDate();
    Warehouse getWarehouse();
    Supplier getClient();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
}
