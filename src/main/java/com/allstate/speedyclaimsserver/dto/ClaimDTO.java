package com.allstate.speedyclaimsserver.dto;

import com.allstate.speedyclaimsserver.domain.Claim;

import java.time.LocalDate;

public class ClaimDTO {

    private String type;
    private String status;

    private Integer policyNumber;

    private String surname;
    private LocalDate claimStartDate;

    private String claimReason;
    private String description;
    private Integer estAmount;

    public ClaimDTO() {
    }

    public ClaimDTO(String type, String status, Integer policyNumber, String surname, LocalDate claimStartDate, String claimReason, String description, Integer estAmount) {
        this.type = type;
        this.status = status;
        this.policyNumber = policyNumber;
        this.surname = surname;
        this.claimStartDate = claimStartDate;
        this.claimReason = claimReason;
        this.description = description;
        this.estAmount = estAmount;
    }

    public Claim toClaim() {
        return new Claim(null, type,  status, policyNumber, surname, claimStartDate, claimReason, description, estAmount);
    }

//    public Claim toClaim() {
//        return new Claim(null, 987, "Mark");
//    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public LocalDate getClaimStartDate() {
        return claimStartDate;
    }

    public void setClaimStartDate(LocalDate claimStartDate) {
        this.claimStartDate = claimStartDate;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEstAmount() {
        return estAmount;
    }

    public void setEstAmount(Integer estAmount) {
        this.estAmount = estAmount;
    }
}


