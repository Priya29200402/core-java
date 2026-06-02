package com.xworkz.nandini.runner;

import com.xworkz.nandini.dao.OrderDetailDAO;
import com.xworkz.nandini.dao.OrderDetailDAOImp;
import com.xworkz.nandini.dto.OrderDetailDTO;
import com.xworkz.nandini.service.OrderDetailService;
import com.xworkz.nandini.service.OrderDetailServiceImp;

public class OrderDetailRunner {
    public static void main(String[] args) {
        OrderDetailDAO orderDetailDAO= new OrderDetailDAOImp();

        OrderDetailService orderDetailService = new OrderDetailServiceImp(orderDetailDAO);

        OrderDetailDTO orderDetailDTO= new OrderDetailDTO(23,"MILK",45,30,1300);

        orderDetailService.validateAndSave(orderDetailDTO);
    }
}
