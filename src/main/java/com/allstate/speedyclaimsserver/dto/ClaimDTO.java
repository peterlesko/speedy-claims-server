package com.allstate.speedyclaimsserver.dto;

import com.allstate.speedyclaimsserver.domain.Claim;

import java.time.LocalDate;

public class ClaimDTO {

    private String type;
    private String status;

    private Integer policyNumber;

    private String name;
    private String surname;

    private LocalDate claimStartDate;

    private String claimReason;
    private String description;

    private Integer estAmount;
    private Integer claimPayOut;

    private String address;

    private String motorMake;
    private String motorModel;
    private Integer motorYom;

    private String petType;
    private String petBreed;

    public ClaimDTO() {
    }

    public ClaimDTO(String type, String status, Integer policyNumber, String name, String surname,
                    LocalDate claimStartDate, String claimReason, String description, Integer estAmount,
                    Integer claimPayOut, String address, String motorMake, String motorModel,
                    Integer motorYom, String petType, String petBreed) {

        this.type = type;
        this.status = status;
        this.policyNumber = policyNumber;
        this.name = name;
        this.surname = surname;
        this.claimStartDate = claimStartDate;
        this.claimReason = claimReason;
        this.description = description;
        this.estAmount = estAmount;
        this.claimPayOut = claimPayOut;
        this.address = address;
        this.motorMake = motorMake;
        this.motorModel = motorModel;
        this.motorYom = motorYom;
        this.petType = petType;
        this.petBreed = petBreed;
    }

    public Claim toClaim() {
        return new Claim(null, type,  status, policyNumber, name, surname, claimStartDate,
                            claimReason, description, estAmount, claimPayOut, address,
                            motorMake, motorModel, motorYom, petType, petBreed);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getClaimPayOut() {
        return claimPayOut;
    }

    public void setClaimPayOut(Integer claimPayOut) {
        this.claimPayOut = claimPayOut;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMotorMake() {
        return motorMake;
    }

    public void setMotorMake(String motorMake) {
        this.motorMake = motorMake;
    }

    public String getMotorModel() {
        return motorModel;
    }

    public void setMotorModel(String motorModel) {
        this.motorModel = motorModel;
    }

    public Integer getMotorYom() {
        return motorYom;
    }

    public void setMotorYom(Integer motorYom) {
        this.motorYom = motorYom;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }
}


