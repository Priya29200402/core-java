package com.xworkz.skybook.runner;

import com.xworkz.skybook.dao.SightDAO;
import com.xworkz.skybook.dao.SightDAOImpl;
import com.xworkz.skybook.dto.SightDTO;
import com.xworkz.skybook.service.SightService;
import com.xworkz.skybook.service.SightServiceImpl;

public class SightRunner {
    public static void main(String[] args) {
        SightDAO sightDAO = new SightDAOImpl();

        SightDTO sightDTO = new SightDTO();

        SightService  sightService = new SightServiceImpl(sightDAO);

        sightService.validateAndSearch(sightDTO);
        
    }
}
