package com.xworkz.skybook.service;

import com.xworkz.skybook.dao.HotelSearchDAO;
import com.xworkz.skybook.dto.HotelSearchDTO;

import java.util.Objects;

public class HotelServiceImpl implements HotelService {
    private HotelSearchDAO hotelSearchDAO;

    public HotelServiceImpl(HotelSearchDAO hotelSearchDAO) {
        this.hotelSearchDAO = hotelSearchDAO;
    }
    @Override
    public boolean validateAndSearch(HotelSearchDTO searchDTO) {
        if(Objects.nonNull(this.hotelSearchDAO)){
            System.out.println("Dao is not null");
            if(Objects.nonNull(searchDTO)){
                System.out.println("searchDTO is not  null we will validate and search");
            }else{
                System.out.println("searchDTO is null cannot search");
            }
        }else{
            System.out.println("Dao is not null we cannot search");
        }
        return false;
    }
}
