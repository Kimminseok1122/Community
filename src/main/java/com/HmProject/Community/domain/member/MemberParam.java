package com.HmProject.Community.domain.member;

import lombok.Data;

@Data
public class MemberParam {

    private String id;
    private String password;

    public MemberParam(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
