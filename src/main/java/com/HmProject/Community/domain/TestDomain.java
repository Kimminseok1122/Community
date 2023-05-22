package com.HmProject.Community.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TestDomain {

    @Id
    @Column
    private Integer id;
    private String name;
}
