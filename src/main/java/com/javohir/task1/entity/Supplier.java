package com.javohir.task1.entity;

import com.javohir.task1.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true) //Abs Entity
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Supplier extends AbsEntity {

    @Column(unique = true, nullable = false)
    private String phoneNumber;

}
