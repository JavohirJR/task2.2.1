package com.javohir.task1.prejection;

import com.javohir.task1.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();
    String getName();
}
