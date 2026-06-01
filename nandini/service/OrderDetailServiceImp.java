package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.OrderDetailDTO;

public class OrderDetailServiceImp implements OrderDetailService {
    @Override
    public boolean validateAndSave(OrderDetailDTO orderDetailDTO) {
        System.out.println("Running validate and Save in OrderDetailDTO: " + orderDetailDTO);
        String orderName = orderDetailDTO.getOrderName();
        if (orderName != null && orderName.length() >= 3 && orderName.length() <= 100 && orderName.matches("[a-zA-Z ,]+")) {
            System.out.println("valid orderName");
        } else {
            System.out.println("invalid orderName");
            return false;
        }

        if (orderDetailDTO.getOrderPrice()>5)
        {
            System.out.println("valid orderPrice");
            return false;
        }
        else {
            System.out.println("Invalid orderPrice");
        }
        System.out.println("validation is completed");
        return false;
    }
}
