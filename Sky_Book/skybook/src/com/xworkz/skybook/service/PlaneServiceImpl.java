package com.xworkz.skybook.service;

import com.xworkz.skybook.dao.PlaneSearchDAO;
import com.xworkz.skybook.dto.PlaneSearchDTO;

import java.util.Objects;

public class PlaneServiceImpl implements PlaneService {
    private PlaneSearchDAO planeSearchDAO;

    public PlaneServiceImpl(PlaneSearchDAO planeSearchDAO) {
        this.planeSearchDAO = planeSearchDAO;
    }
    @Override
    public boolean validateAndSearch(PlaneSearchDTO planeSearchDTO) {
        System.out.println("Validating and Searching Plane Booking details");
        if(Objects.nonNull(this.planeSearchDAO)){
            System.out.println("Dao is not null");
            if(Objects.nonNull(planeSearchDTO)){
                System.out.println("PlaneSearchDTO is not  null we will validate before search");
            }else{
                System.out.println("PlaneSearchDTO is null cannot search");
            }
        } else{
            System.out.println("Dao is null cannot search");
        }
        return false;
    }
}
