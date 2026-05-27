package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.SalesDetailDTO;

public class SalesDetailServiceImp implements SalesDetailService{
    @Override
    public void validateAndSave(SalesDetailDTO detailDTO) {
        System.out.println("Running ValidateAndSave :{}"+detailDTO);
    }
}
