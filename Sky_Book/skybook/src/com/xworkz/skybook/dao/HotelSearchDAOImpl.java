package com.xworkz.skybook.dao;

import com.xworkz.skybook.dto.HotelSearchDTO;

public class HotelSearchDAOImpl implements HotelSearchDAO {
    @Override
    public boolean search(HotelSearchDTO searchDTO) {
        System.out.println("Running search in Hotel DAO");
        return false;
    }
}
