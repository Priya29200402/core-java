package com.xworkz.nandini.service;

import com.xworkz.nandini.dao.OrderDetailDAO;
import com.xworkz.nandini.dto.OrderDetailDTO;

public class OrderDetailServiceImp implements OrderDetailService{
    private OrderDetailDAO  orderDetailDAO;
    public OrderDetailServiceImp(OrderDetailDAO orderDetailDAO) {
        this.orderDetailDAO = orderDetailDAO;

    }

    @Override
    public boolean validateAndSave(OrderDetailDTO orderDetailDTO) {
        System.out.println("Validating all required fields");
        if(orderDetailDTO.getOrderName()!=null && orderDetailDTO.getOrderName().length()>=3 && orderDetailDTO.getOrderName().length()<=10){
            System.out.println("Valid Order name");
        }else{
            System.out.println("Invalid Order name");
        }
        if(orderDetailDTO.getOrderID()!=0 && orderDetailDTO.getOrderID()>=3 && orderDetailDTO.getOrderID()<=10){
            System.out.println("Valid Order ID");
        }else{
            System.out.println("Invalid Order ID");
        }
        if(orderDetailDTO.getOrderQuantity()!= 0 && orderDetailDTO.getOrderQuantity()>=2 && orderDetailDTO.getOrderQuantity()<=500){
            System.out.println("Valid Order Quantity");
        }else {
            System.out.println("Invalid Order Quantity");
        }
        System.out.println("All validation is completed...");
        if(this.orderDetailDAO!=null){
            System.out.println("orderDetailDAO is  not null we will save it"+ orderDetailDTO);
            this.orderDetailDAO.save(orderDetailDTO);
            System.out.println("OrderDetail has been saved");
        }

        return false;
    }
}
