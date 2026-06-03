package com.xworkz.skybook.service;

import com.xworkz.skybook.dao.CabDAO;
import com.xworkz.skybook.dao.CabDAOImpl;
import com.xworkz.skybook.dto.CabDTO;

import java.util.Objects;

public class CabServiceImpl implements CabService {
    private CabDAO cabDAO;
    public CabServiceImpl(CabDAO cabDAO) {
        this.cabDAO = new CabDAOImpl();
    }
    @Override
    public boolean validateAndSearch(CabDTO cabDTO) {
        if(Objects.nonNull(this.cabDAO)) {
            System.out.println("Dao is not null");
            if (Objects.nonNull(cabDTO)) {
                System.out.println("Cab dto is not null we can validate and search");
            } else {
                System.out.println("Cab dto is not null we cannot validate and search");
            }
        }else{
            System.out.println("Dao is null");
        }
        return false;
    }
}
