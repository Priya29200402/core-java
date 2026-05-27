package com.xworkz.nandini.runner;

import com.xworkz.nandini.dto.SalesDetailDTO;
import com.xworkz.nandini.service.SalesDetailService;
import com.xworkz.nandini.service.SalesDetailServiceImp;

public class SalesRunner {
    public static void main(String[] args) {
        SalesDetailService salesDetailService= new SalesDetailServiceImp();

        SalesDetailDTO salesDetailDTO = new SalesDetailDTO("AP_345","Milk",235,"Anurag","Bengaluru");
        salesDetailService.validateAndSave(salesDetailDTO);
    }
}
