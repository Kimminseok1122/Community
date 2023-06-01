package com.HmProject.Community.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("R")
@Getter
@Setter
public class Review extends Total_Board{

    private String review_point;

}
