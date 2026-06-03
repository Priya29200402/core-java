package com.xworkz.skybook.dao;

import com.xworkz.skybook.dto.HotelSearchDTO;

public interface HotelSearchDAO {
    boolean search(HotelSearchDTO searchDTO);
}
