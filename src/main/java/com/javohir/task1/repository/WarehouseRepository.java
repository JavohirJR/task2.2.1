package com.javohir.task1.repository;

import com.javohir.task1.entity.Warehouse;
import com.javohir.task1.prejection.CustomWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "warehouse_list",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
}
