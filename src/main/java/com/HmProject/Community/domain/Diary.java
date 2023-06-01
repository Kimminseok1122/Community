package com.HmProject.Community.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("D")
@Getter
@Setter
public class Diary extends Total_Board{

    private String diary_title;
    private String diary_content;
    private String diary_category;
    private String diary_date;
    private String diary_likes;
    private String diary_views;
}
