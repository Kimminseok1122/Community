package com.HmProject.Community.domain.member;

import lombok.Data;

@Data
public class DuplicateResult {

    private String result;

    public DuplicateResult(String result) {
        this.result = result;
    }
}
