package com.HmProject.Community.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "BOARD_CATEGORY")
@Setter
@Getter
public abstract class Total_Board {

    @Id
    @GeneratedValue
    private Long board_number;
    private String board_title;
    private String board_content;
    private String board_date;
    private String board_likes;
    private String board_views;

//    @OneToMany(mappedBy = "member_id")
//    private String member_id;
}
