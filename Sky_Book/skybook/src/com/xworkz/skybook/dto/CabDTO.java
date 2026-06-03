package com.xworkz.skybook.dto;

import com.xworkz.skybook.constant.CabTripType;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor


public class CabDTO {
    private CabTripType cabTripType;
    private String from;
    private String to;
    private LocalDate pickupDate;
    private LocalTime  pickupTime;
}
