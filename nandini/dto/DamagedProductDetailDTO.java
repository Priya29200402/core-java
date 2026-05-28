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

public class DamagedProductDetailDTO implements Serializable {
    private String productName;
    private String productCode;
    private String productDescription;
    private double productPrice;
    private String productCategory;

}
