package com.xworkz.nandini.dao;

import com.xworkz.nandini.dto.DamagedProductDetailDTO;

public class DamagedProductDAOImp implements DamagedProductDAO{
    @Override
    public void save(DamagedProductDetailDTO detailDTO) {
        System.out.println(" Running save in DamagedProductDAOImp");
    }
}
