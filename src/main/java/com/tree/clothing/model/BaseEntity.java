package com.tree.clothing.model;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class BaseEntity {

    @Column
    private Long id;

    @Column
    private Date createDt;

    @Column
    private Date updateDt;

}
