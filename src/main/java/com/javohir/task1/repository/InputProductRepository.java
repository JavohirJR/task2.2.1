package com.javohir.task1.repository;

import com.javohir.task1.entity.InputProduct;
import com.javohir.task1.prejection.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input-product", collectionResourceRel = "input_product_list",excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {




}
