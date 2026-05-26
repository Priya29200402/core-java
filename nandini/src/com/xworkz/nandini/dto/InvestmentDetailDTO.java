package com.xworkz.nandini.dto;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.Serializable;



public class InvestmentDetailDTO implements Serializable {

    private String investorName;
    private String location;
    private Long mobile;
    private Double minInvestment;
    private Double maxInvestment;

    

    public InvestmentDetailDTO(String investorName, String location, Long mobile, Double minInvestment, Double maxInvestment) {
        this.investorName = investorName;
        this.location = location;
        this.mobile = mobile;
        this.minInvestment = minInvestment;
        this.maxInvestment = maxInvestment;
    }

    public String getInvestorName() {
        return investorName;
    }

    public String getLocation() {
        return location;
    }

    public Long getMobile() {
        return mobile;
    }

    public Double getMinInvestment() {
        return minInvestment;
    }

    public Double getMaxInvestment() {
        return maxInvestment;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public void setMinInvestment(Double minInvestment) {
        this.minInvestment = minInvestment;
    }

    public void setMaxInvestment(Double maxInvestment) {
        this.maxInvestment = maxInvestment;
    }

}
