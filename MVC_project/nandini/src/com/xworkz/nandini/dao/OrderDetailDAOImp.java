package com.xworkz.nandini.dao;

import com.xworkz.nandini.dto.OrderDetailDTO;

public class OrderDetailDAOImp implements OrderDetailDAO{
    @Override
    public void save(OrderDetailDTO orderDetailDTO) {
        System.out.println("Running save in Order Detail DAO Impl");
    }
}
