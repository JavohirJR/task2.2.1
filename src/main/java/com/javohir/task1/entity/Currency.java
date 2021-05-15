package com.javohir.task1.entity;

import com.javohir.task1.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
@Entity
public class Currency extends AbsEntity {
}
