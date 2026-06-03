package com.xworkz.skybook.dto;

import com.xworkz.skybook.constant.SearchType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class HotelSearchDTO{
    private SearchType searchType;
    private String destination;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int noOfGuest;
    private int noOfRoom;
}
