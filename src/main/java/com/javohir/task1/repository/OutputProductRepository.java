package com.javohir.task1.repository;

import com.javohir.task1.entity.OutputProduct;
import com.javohir.task1.prejection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output-product", collectionResourceRel = "output_product_list",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {



}
