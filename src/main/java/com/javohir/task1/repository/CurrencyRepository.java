package com.javohir.task1.repository;

import com.javohir.task1.entity.Currency;
import com.javohir.task1.prejection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "currency_list",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
