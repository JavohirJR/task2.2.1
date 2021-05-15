package com.javohir.task1.prejection;

import com.javohir.task1.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
    String getParentCategory();
}
