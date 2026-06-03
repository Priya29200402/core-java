package com.xworkz.skybook.service;

import com.xworkz.skybook.dao.SightDAO;
import com.xworkz.skybook.dto.SightDTO;

public interface SightService {
    boolean validateAndSearch(SightDTO sightDTO);
}
