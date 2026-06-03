package com.xworkz.skybook.service;

import com.xworkz.skybook.dao.PlaneStatusDAO;
import com.xworkz.skybook.dto.PlaneStatusDTO;
import lombok.*;

import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class PlaneStatusServiceImpl implements PlaneStatusService {
    private PlaneStatusDAO planeStatusDAO;

    @Override
    public boolean validateAndSearch(PlaneStatusDTO planeStatusDTO) {
        if(Objects.nonNull(this.planeStatusDAO)){
            System.out.println("Dao is not null");
            if(Objects.nonNull(planeStatusDTO)){
                System.out.println("dto is not null we can validate and search");
            }else{
                System.err.println("dto is not null we cannot validate and search");
            }
        }else{
            System.err.println("Dao is not null");
        }
        return false;
    }
}
