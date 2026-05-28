package com.xworkz.nandini.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class ExpiredProductDetailDTO implements Serializable {
    private String productName;
    private String productCode;
    private double productPrice;
    private String manufacturedDate;
    private String expiryDate;

}
