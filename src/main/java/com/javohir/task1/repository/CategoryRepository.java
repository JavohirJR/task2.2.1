package com.javohir.task1.repository;

import com.javohir.task1.entity.Category;
import com.javohir.task1.prejection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "category_list",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {


}
