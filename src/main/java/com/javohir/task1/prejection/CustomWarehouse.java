package com.javohir.task1.prejection;

import com.javohir.task1.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();
    String getName();
}
