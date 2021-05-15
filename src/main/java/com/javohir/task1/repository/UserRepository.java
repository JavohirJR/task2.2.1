package com.javohir.task1.repository;

import com.javohir.task1.entity.User;
import com.javohir.task1.prejection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "user_list",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
