package com.tree.clothing.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class Clothing extends BaseEntity {

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private Category type;



}
