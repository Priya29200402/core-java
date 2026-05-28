package com.xworkz.nandini.runner;

import com.xworkz.nandini.dto.DamagedProductDetailDTO;
import com.xworkz.nandini.service.DamagedProductDetailService;
import com.xworkz.nandini.service.DamagedProductDetailServiceImp;

public class DamagedProductDetailRunner {
    public static void main(String[] args) {
        DamagedProductDetailService damagedProductDetailService=new DamagedProductDetailServiceImp();

        DamagedProductDetailDTO detailDTO=new DamagedProductDetailDTO("MilkShake","MilkShake_2356","The milkshake bottle is broken",35,"Dairy");
        damagedProductDetailService.validateAndSave(detailDTO);
    }
}
