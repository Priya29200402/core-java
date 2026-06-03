package com.xworkz.skybook.service;

import com.xworkz.skybook.dto.PlaneSearchDTO;

public interface PlaneService {
    boolean validateAndSearch(PlaneSearchDTO planeSearchDTO);
}
