package com.HmProject.Community.domain.member;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Member {

        private String id;
        private Long number;
        private String password;
        private String name;
        private String gender;
        private String email;
        private LocalDate birth;
        private String phoneNumber;
        private LocalDateTime signDate;
        private String nickName;
        private Integer point;
        private String levelCode;
        private String zipCode;
        private String address;
        private String addressDetail;
        private String activeFlag;

    public Member() {
    }

    public Member(String id, String password, String name, String gender, String email, LocalDate birth, String phoneNumber, String nickName, String zipCode, String address, String addressDetail) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.birth = birth;
        this.phoneNumber = phoneNumber;
        this.nickName = nickName;
        this.zipCode = zipCode;
        this.address = address;
        this.addressDetail = addressDetail;
    }
}
