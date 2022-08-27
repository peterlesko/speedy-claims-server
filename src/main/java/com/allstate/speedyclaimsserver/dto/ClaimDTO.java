package com.allstate.speedyclaimsserver.dto;

import com.allstate.speedyclaimsserver.domain.Claim;

public class ClaimDTO {

    private Integer policyNumber;
    private String surname;

    public ClaimDTO() {
    }

    public ClaimDTO(Claim claim) {
        this.policyNumber = claim.getPolicyNumber();
        this.surname = claim.getSurname();
    }

    public Claim toClaim() {
        return new Claim(null, policyNumber, surname);
    }

//    public Claim toClaim() {
//        return new Claim(null, 987, "Mark");
//    }

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



