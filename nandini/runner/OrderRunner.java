package com.xworkz.nandini.runner;

import com.xworkz.nandini.dto.OrderDetailDTO;
import com.xworkz.nandini.service.OrderDetailService;
import com.xworkz.nandini.service.OrderDetailServiceImp;

public class OrderRunner {
    public static void main(String[] args) {
        OrderDetailService orderDetailService= new OrderDetailServiceImp();
        OrderDetailDTO orderDetailDTO = new OrderDetailDTO(367,"Curd",457.97,45,1200);
        orderDetailService.validateAndSave(orderDetailDTO);
    }
}
