package com.xworkz.skybook.dto;


import com.xworkz.skybook.constant.PlaneStatus;
import com.xworkz.skybook.constant.PlaneStatusSearchType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class PlaneStatusDTO {
    private PlaneStatusSearchType planeStatusSearchType;
    private LocalDate date;
    private PlaneStatus planeStatus;

}
