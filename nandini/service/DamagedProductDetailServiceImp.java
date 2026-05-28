package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.DamagedProductDetailDTO;

public class DamagedProductDetailServiceImp implements DamagedProductDetailService {
    @Override
    public void validateAndSave(DamagedProductDetailDTO detailDTO) {
        System.out.println("Running validate and save to store the damaged product detail: " + detailDTO);
    }
}
