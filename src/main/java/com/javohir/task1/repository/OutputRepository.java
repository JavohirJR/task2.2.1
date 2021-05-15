package com.javohir.task1.repository;

import com.javohir.task1.entity.Output;
import com.javohir.task1.prejection.CustomOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", collectionResourceRel = "output_list",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
