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

    private String review_title;
    private String review_content;
    private String review_category;
    private String review_date;
    private String review_likes;
    private String review_views;

}
