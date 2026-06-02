package com.xworkz.nandini.dao;

import com.xworkz.nandini.dto.CustomerDetailDTO;

public class CustomerDetailDAOImp implements CustomerDetailDAO{

    @Override
    public void save(CustomerDetailDTO detailDTO) {
        System.out.println("Running save in CustomerDetailDAOImpl");
        System.out.println("Customer details saved:"+ detailDTO);
    }
}
