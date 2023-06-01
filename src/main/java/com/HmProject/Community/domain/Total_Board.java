package com.HmProject.Community.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "BOARD_CATEGORY")
@Getter
public abstract class Total_Board {

    @Id
    @GeneratedValue
    private Long board_number;

//    @OneToMany(mappedBy = "member_id")
//    private String member_id;
}
