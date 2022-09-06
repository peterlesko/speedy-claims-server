package com.allstate.speedyclaimsserver.domain;

import javax.persistence.*;

@Entity
@Table(name="claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer claimId;

    @Column(name="policy_number")
    Integer policyNumber;

    String surname;
    String status;
    String type;

    public Claim() {
    }

//    public Claim(Integer claimId, Integer policyNumber, String surname) {
//        this.claimId = claimId;
//        this.policyNumber = policyNumber;
//        this.surname = surname;
//    }

//    public Claim(Integer claimId, Integer policyNumber, String surname, String status) {
//        this.claimId = claimId;
//        this.policyNumber = policyNumber;
//        this.surname = surname;
//        this.status = status;
//    }

    public Claim(Integer claimId, Integer policyNumber, String surname, String status, String type) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.surname = surname;
        this.status = status;
        this.type = type;
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
//
//    @Override
//    public String toString() {
//        return "Claim{" +
//                "claimId=" + claimId +
//                ", policyNumber=" + policyNumber +
//                ", surname='" + surname + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", policyNumber=" + policyNumber +
                ", surname='" + surname + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

