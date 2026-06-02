package com.xworkz.nandini.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class KMFDetailDTO {
    private String location;
    private double installationCost;
    private double productCost;
    private String website;
    private int noOfProduct;
}
