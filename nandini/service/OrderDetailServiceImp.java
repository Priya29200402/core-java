package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.OrderDetailDTO;

public class OrderDetailServiceImp implements OrderDetailService {
    @Override
    public void validateAndSave(OrderDetailDTO orderDetailDTO) {
        System.out.println("Running validate and Save in OrderDetailDTO: " + orderDetailDTO);
    }
}
