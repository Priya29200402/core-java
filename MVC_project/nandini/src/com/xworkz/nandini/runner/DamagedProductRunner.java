package com.xworkz.nandini.runner;

import com.xworkz.nandini.dao.DamagedProductDAO;
import com.xworkz.nandini.dao.DamagedProductDAOImp;
import com.xworkz.nandini.dto.DamagedProductDetailDTO;
import com.xworkz.nandini.service.DamagedProductService;
import com.xworkz.nandini.service.DamagedProductServiceImp;

public class DamagedProductRunner {
    public static void main(String[] args) {
        DamagedProductDAO damagedProductDAO = new DamagedProductDAOImp();
        DamagedProductService  damagedProductService = new DamagedProductServiceImp(damagedProductDAO);
        DamagedProductDetailDTO damagedProductDetailDTO = new DamagedProductDetailDTO("Curd","12L","Curd packet is torn",15,"Dairy");
        damagedProductService.validateAndSave(damagedProductDetailDTO);
    }
}
