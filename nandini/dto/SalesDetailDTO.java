package com.xworkz.nandini.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString



public class SalesDetailDTO implements Serializable {
    private String salesID;
    private String salesName;
    private int customerID;
    private String customerName;
    private String customerAddress;



}
