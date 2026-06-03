package com.xworkz.skybook.dao;

import com.xworkz.skybook.dto.SightDTO;

public class SightDAOImpl implements SightDAO {
    @Override
    public boolean search(SightDTO sightDTO) {
        System.out.println("search sight from dao");
        return false;
    }
}
