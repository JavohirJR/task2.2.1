package com.javohir.task1.prejection;

import com.javohir.task1.entity.User;
import com.javohir.task1.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();
    String getFirstName();
    String getLastName();
    String getCode();
    Set<Warehouse> getWarehouses();
}
