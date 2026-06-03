package com.xworkz.skybook.runner;

import com.xworkz.skybook.dao.HotelSearchDAO;
import com.xworkz.skybook.dao.HotelSearchDAOImpl;
import com.xworkz.skybook.dto.HotelSearchDTO;
import com.xworkz.skybook.service.HotelService;
import com.xworkz.skybook.service.HotelServiceImpl;

public class HotelSearchRunner {
    public static void main(String[] args) {
        HotelSearchDAO dao = new HotelSearchDAOImpl();

        HotelSearchDTO searchDTO = new HotelSearchDTO();

        HotelService  hotelService = new HotelServiceImpl(dao);

        hotelService.validateAndSearch(searchDTO);

    }
}
