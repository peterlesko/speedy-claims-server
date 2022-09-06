package com.allstate.speedyclaimsserver.dto;

import com.allstate.speedyclaimsserver.domain.Claim;

import java.time.LocalDate;

public class ClaimDTO {

    private Integer policyNumber;
    private String surname;
    private String status;
    private String type;
    private LocalDate date;

    public ClaimDTO() {
    }

    public ClaimDTO(Integer policyNumber, String surname, String status, String type, LocalDate date) {
        this.policyNumber = policyNumber;
        this.surname = surname;
        this.status = status;
        this.type = type;
        this.date = date;
    }

    public Claim toClaim() {
        return new Claim(null, policyNumber, surname, status, type, date);
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}


