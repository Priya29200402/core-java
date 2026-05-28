package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.ExpiredProductDetailDTO;

public class ExpiredProductDetailServiceImp implements ExpiredProductDetailService {
    @Override
    public void validateAndSave(ExpiredProductDetailDTO expiredProductDetailDTO) {
        System.out.println("Running validate and save to store the expired product detail:"+expiredProductDetailDTO);
    }
}
