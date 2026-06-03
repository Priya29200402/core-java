package com.xworkz.skybook.runner;

import com.xworkz.skybook.dao.PlaneSearchDAO;
import com.xworkz.skybook.dao.PlaneSearchDAOImpl;
import com.xworkz.skybook.dto.PlaneSearchDTO;
import com.xworkz.skybook.service.PlaneService;
import com.xworkz.skybook.service.PlaneServiceImpl;

public class PlaneSearchRunner {
    public static void main(String[] args) {
        PlaneSearchDAO planeSearchDAO=new PlaneSearchDAOImpl();

        PlaneSearchDTO planeSearchDTO=new PlaneSearchDTO();

        PlaneService planeService=new PlaneServiceImpl(planeSearchDAO);

        planeService.validateAndSearch(planeSearchDTO);
    }
}
