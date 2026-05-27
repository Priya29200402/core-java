package com.xworkz.nandini.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor

public class KMFDetailDTO implements Serializable {
    private String location;
    private double installationCost;
    private double productCost;
    private String website;
    private int noOfProduct;
}
