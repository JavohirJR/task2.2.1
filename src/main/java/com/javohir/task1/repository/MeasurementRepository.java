package com.javohir.task1.repository;

import com.javohir.task1.entity.Measurement;
import com.javohir.task1.prejection.CustomMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "measurement_list",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

}
