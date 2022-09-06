package com.allstate.speedyclaimsserver.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer claimId;

    @Column(name="policy_number")
    private Integer policyNumber;

    private String surname;
    private String status;
    private String type;
    private LocalDate date;

    public Claim() {
    }

//    public Claim(Integer claimId, Integer policyNumber, String surname, String status, String type) {
//        this.claimId = claimId;
//        this.policyNumber = policyNumber;
//        this.surname = surname;
//        this.status = status;
//        this.type = type;
//    }

    public Claim(Integer claimId, Integer policyNumber, String surname, String status, String type, LocalDate date) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.surname = surname;
        this.status = status;
        this.type = type;
        this.date = date;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void setSurname(String surname) {
        this.surname = surname;
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

    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", policyNumber=" + policyNumber +
                ", surname='" + surname + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}

