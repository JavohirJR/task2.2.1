package com.javohir.task1.repository;

import com.javohir.task1.entity.Input;
import com.javohir.task1.prejection.CustomInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", collectionResourceRel = "input_list",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {

}
