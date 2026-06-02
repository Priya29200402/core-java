package com.xworkz.nandini.runner;

import com.xworkz.nandini.dao.CustomerDetailDAO;
import com.xworkz.nandini.dao.CustomerDetailDAOImp;
import com.xworkz.nandini.dto.CustomerDetailDTO;
import com.xworkz.nandini.service.CustomerDetailService;
import com.xworkz.nandini.service.CustomerDetailServiceImp;

public class CustomerRunner {
    public static void main(String[] args) {

        CustomerDetailDAO customerDetailDAO= new CustomerDetailDAOImp();
        CustomerDetailService customerDetailService = new CustomerDetailServiceImp(customerDetailDAO);

        CustomerDetailDTO customerDetailDTO = new CustomerDetailDTO("Anurag",10,"Anurag@gmail.com",2546087857L,"BTM Bengaluru");
        customerDetailService.validateAndSave(customerDetailDTO);
    }
}
