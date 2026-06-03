package com.xworkz.skybook.service;

import com.xworkz.skybook.dto.HotelSearchDTO;

public interface HotelService {
    boolean validateAndSearch(HotelSearchDTO searchDTO);
}
