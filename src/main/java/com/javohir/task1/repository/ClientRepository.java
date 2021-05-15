package com.javohir.task1.repository;

import com.javohir.task1.entity.Client;
import com.javohir.task1.prejection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", collectionResourceRel = "client_list",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
