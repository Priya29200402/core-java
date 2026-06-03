package com.xworkz.skybook.runner;

import com.xworkz.skybook.dao.CabDAO;
import com.xworkz.skybook.dao.CabDAOImpl;
import com.xworkz.skybook.dto.CabDTO;
import com.xworkz.skybook.service.CabService;
import com.xworkz.skybook.service.CabServiceImpl;

public class CabRunner {
    public static void main(String[] args) {
        CabDAO cabDAO=new CabDAOImpl();
        CabDTO cabDTO=new CabDTO();
        CabService cabService=new CabServiceImpl(cabDAO);
        boolean found=cabService.validateAndSearch(cabDTO);
        System.out.println("Found:"+found);
    }
}
