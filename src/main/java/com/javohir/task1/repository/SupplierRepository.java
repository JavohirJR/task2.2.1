package com.javohir.task1.repository;

import com.javohir.task1.entity.Supplier;
import com.javohir.task1.prejection.CustomSupplier;
import com.javohir.task1.prejection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "supplier_list",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
