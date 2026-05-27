package com.xworkz.nandini.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class OrderDetailDTO implements Serializable {
    private int orderID;
    private String orderName;
    private double orderPrice;
    private int orderQuantity;
    private double orderTotal;

}
