package com.xworkz.skybook.dto;

import com.xworkz.skybook.constant.TripType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class PlaneSearchDTO {
    private TripType tripType;
    private String from;
    private String to;
    private LocalDate departure;
    private LocalDate returnDate;
    private int passengers;
}
