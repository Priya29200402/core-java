package com.xworkz.nandini.runner;

import com.xworkz.nandini.dto.ExpiredProductDetailDTO;
import com.xworkz.nandini.service.ExpiredProductDetailService;
import com.xworkz.nandini.service.ExpiredProductDetailServiceImp;

public class ExpiredProductRunner {
    public static void main(String[] args) {
        ExpiredProductDetailService expiredProductDetailService= new ExpiredProductDetailServiceImp();

        ExpiredProductDetailDTO expiredProductDetailDTO=new ExpiredProductDetailDTO("Curd","Curd_2354",25.00,"12/01/2026","12/02/2026");
        expiredProductDetailService.validateAndSave(expiredProductDetailDTO);
    }
}
