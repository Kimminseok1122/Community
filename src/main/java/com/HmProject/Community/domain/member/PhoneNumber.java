package com.HmProject.Community.domain.member;


import lombok.Data;

@Data
public class PhoneNumber {

    private String startNumber;
    private String middleNumber;
    private String endNumber;

    public PhoneNumber(String startNumber, String middleNumber, String endNumber) {
        this.startNumber = startNumber;
        this.middleNumber = middleNumber;
        this.endNumber = endNumber;
    }

    public String getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(String startNumber) {
        this.startNumber = startNumber;
    }

    public String getMiddleNumber() {
        return middleNumber;
    }

    public void setMiddleNumber(String middleNumber) {
        this.middleNumber = middleNumber;
    }

    public String getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(String endNumber) {
        this.endNumber = endNumber;
    }
}
