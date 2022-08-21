package com.allstate.speedyclaimsserver.domain;

public class Claim {

    private Integer claimId;
    private String policyType;
    private Integer policyNumber;
    private String surname;

    public Claim() {
    }

    public Claim(Integer claimId, String policyType, Integer policyNumber, String surname) {
        this.claimId = claimId;
        this.policyType = policyType;
        this.policyNumber = policyNumber;
        this.surname = surname;
    }

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Integer getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Integer policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
