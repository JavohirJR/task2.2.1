package com.javohir.task1.prejection;

import com.javohir.task1.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Integer getId();

    String getName();

}
