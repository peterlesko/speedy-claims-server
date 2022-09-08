package com.allstate.speedyclaimsserver.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer claimId;

    private String type;
    private String status;

    @Column(name = "policy_number")
    private Integer policyNumber;

    private String name;
    private String surname;

    @Column(name = "claim_start_date")
    private LocalDate claimStartDate;

    @Column(name = "claim_reason")
    private String claimReason;

    private String description;

    @Column(name = "estimated_amount")
    private Integer estAmount;

    @Column(name = "claim_pay_out")
    private Integer claimPayOut;

    private String address;

    @Column(name = "motor_make")
    private String motorMake;

    @Column(name = "motor_model")
    private String motorModel;

    @Column(name = "motor_yom")
    private Integer motorYom;

    @Column(name = "pet_type")
    private String petType;

    @Column(name = "pet_breed")
    private String petBreed;

    public Claim() {
    }

    public Claim(Integer claimId, String type, String status, Integer policyNumber, String name,
                 String surname, LocalDate claimStartDate, String claimReason, String description,
                 Integer estAmount, Integer claimPayOut, String address, String motorMake,
                 String motorModel, Integer motorYom, String petType, String petBreed) {

        this.claimId = claimId;
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

    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", policyNumber=" + policyNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", claimStartDate=" + claimStartDate +
                ", claimReason='" + claimReason + '\'' +
                ", description='" + description + '\'' +
                ", estAmount=" + estAmount +
                ", claimPayOut=" + claimPayOut +
                ", address='" + address + '\'' +
                ", motorMake='" + motorMake + '\'' +
                ", motorModel='" + motorModel + '\'' +
                ", motorYom=" + motorYom +
                ", petType='" + petType + '\'' +
                ", petBreed='" + petBreed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if(this==o)return true;
        if(o ==null|| getClass() !=o.getClass())return false;

        Claim that = (Claim) o;
        return Objects.equals(claimId, that.claimId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimId);
    }




}

