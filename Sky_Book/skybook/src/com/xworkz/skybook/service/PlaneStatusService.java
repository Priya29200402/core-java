package com.xworkz.skybook.service;

import com.xworkz.skybook.dto.PlaneStatusDTO;

public interface PlaneStatusService {
    boolean validateAndSearch(PlaneStatusDTO planeStatusDTO);
}
