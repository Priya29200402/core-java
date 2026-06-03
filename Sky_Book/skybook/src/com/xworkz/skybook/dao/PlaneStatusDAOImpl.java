package com.xworkz.skybook.dao;

import com.xworkz.skybook.dto.PlaneStatusDTO;

public class PlaneStatusDAOImpl implements PlaneStatusDAO{
    @Override
    public boolean search(PlaneStatusDTO planeStatusDTO) {
        System.out.println("Checking plane status");
        return true;
    }
}
