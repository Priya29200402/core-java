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

public class CustomerDetailDTO implements Serializable {
    private String customerName;
    private int customerId;
    private String customerEmail;
    private long customerPhone;
    private String customerAddress;

}
