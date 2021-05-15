package com.javohir.task1.prejection;

import com.javohir.task1.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
