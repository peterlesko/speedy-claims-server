package com.allstate.speedyclaimsserver.dto;

import com.allstate.speedyclaimsserver.domain.Claim;

public class ClaimDTO {

    private Integer policyNumber;
    private String surname;
    private String status;
    private String type;

    public ClaimDTO() {
    }

//    public ClaimDTO(Claim claim) {
//        this.policyNumber = claim.getPolicyNumber();
//        this.surname = claim.getSurname();
//        this.status = claim.getStatus();
//    }

    public ClaimDTO(Integer policyNumber, String surname, String status, String type) {
        this.policyNumber = policyNumber;
        this.surname = surname;
        this.status = status;
        this.type = type;
    }
//    public Claim toClaim() {
//        return new Claim(null, policyNumber, surname);
//    }

    public Claim toClaim() {
        return new Claim(null, policyNumber, surname, status, type);
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


