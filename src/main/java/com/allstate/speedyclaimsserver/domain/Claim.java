package com.allstate.speedyclaimsserver.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer claimId;

    private String type;
    private String status;

    @Column(name="policy_number")
    private Integer policyNumber;

    private String surname;
    @Column(name="date")
    private LocalDate claimStartDate;

    private String claimReason;
    private String description;
    private Integer estAmount;
//    private String
//    private String
//    private String

    public Claim() {
    }


    public Claim(Integer claimId, String type, String status, Integer policyNumber, String surname, LocalDate claimStartDate, String claimReason, String description, Integer estAmount) {
        this.claimId = claimId;
        this.type = type;
        this.status = status;
        this.policyNumber = policyNumber;
        this.surname = surname;
        this.claimStartDate = claimStartDate;
        this.claimReason = claimReason;
        this.description = description;
        this.estAmount = estAmount;
    }

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

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

    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", policyNumber=" + policyNumber +
                ", surname='" + surname + '\'' +
                ", claimStartDate=" + claimStartDate +
                ", claimReason='" + claimReason + '\'' +
                ", description='" + description + '\'' +
                ", estAmount=" + estAmount +
                '}';
    }
}

