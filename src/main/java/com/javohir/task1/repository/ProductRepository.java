package com.javohir.task1.repository;

import com.javohir.task1.entity.Product;
import com.javohir.task1.prejection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "product_list",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
