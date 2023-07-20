package com.HmProject.Community.domain.member;

import lombok.Data;

import java.util.Date;

@Data
public class Member {

        private String id;
        private Long number;
        private String password;
        private String name;
        private String gender;
        private String email;
        private Date birth;
        private String phoneNumber;
        private Date signDate;
        private String nickName;
        private Integer point;
        private String levelCode;
        private String zipCode;
        private String address;
        private String addressDetail;

    public Member() {
    }

    public Member(String password, String name,
                  String gender, String email, Date birth,
                  String phoneNumber, Date signDate, String nickName,
                  Integer point, String levelCode, String zipCode,
                  String address, String addressDetail) {
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.birth = birth;
        this.phoneNumber = phoneNumber;
        this.signDate = signDate;
        this.nickName = nickName;
        this.point = point;
        this.levelCode = levelCode;
        this.zipCode = zipCode;
        this.address = address;
        this.addressDetail = addressDetail;
    }
}
