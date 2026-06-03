package com.xworkz.skybook.runner;

import com.xworkz.skybook.dao.PlaneStatusDAO;
import com.xworkz.skybook.dao.PlaneStatusDAOImpl;
import com.xworkz.skybook.dto.PlaneStatusDTO;
import com.xworkz.skybook.service.PlaneStatusService;
import com.xworkz.skybook.service.PlaneStatusServiceImpl;

public class PlaneStatusRunner {
    public static void main(String[] args) {
        PlaneStatusDAO planeStatusDAO=new PlaneStatusDAOImpl();
        PlaneStatusDTO planeStatusDTO=new PlaneStatusDTO();
        PlaneStatusService status= new PlaneStatusServiceImpl();
        boolean found=planeStatusDAO.search(planeStatusDTO);
        System.out.println("Found: "+found);
    }
}
