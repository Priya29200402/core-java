package com.xworkz.skybook.service;

import com.xworkz.skybook.dao.SightDAO;
import com.xworkz.skybook.dto.SightDTO;

import java.util.Objects;

public class SightServiceImpl implements  SightService {
    private SightDAO  sightDAO;

    public SightServiceImpl(SightDAO sightDAO) {
        this.sightDAO = sightDAO;
    }
    @Override
    public boolean validateAndSearch(SightDTO sightDTO) {
        if(Objects.nonNull(this.sightDAO)){
            System.out.println("DAO is not null");
            if(Objects.nonNull(sightDTO)){
                System.out.println("sightDTO is not null we will validate and search");
            }else {
                System.err.println("sightDTO is null cannot validate and search");
            }
        }else{
            System.err.println("sight DAO is null cannot search");
        }
        return false;
    }
}
