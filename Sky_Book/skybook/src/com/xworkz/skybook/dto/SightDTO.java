package com.xworkz.skybook.dto;

import com.xworkz.skybook.constant.AttractionType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class SightDTO {
    private String whereTo;
    private LocalDate tripDate;
    private AttractionType attractionType;
}
