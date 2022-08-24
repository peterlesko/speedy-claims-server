package com.allstate.speedyclaimsserver.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer claimId;

    Integer policyNumber;
    String surname;

    public Claim() {
    }

    public Claim(Integer claimId, Integer policyNumber, String surname) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.surname = surname;
    }

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
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