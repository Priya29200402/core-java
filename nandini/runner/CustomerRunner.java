package com.xworkz.nandini.runner;

import com.xworkz.nandini.dto.CustomerDetailDTO;
import com.xworkz.nandini.service.CustomerDetailSeriviceImp;
import com.xworkz.nandini.service.CustomerDetailService;

public class CustomerRunner {
    public static void main(String[] args) {
        CustomerDetailService customerDetailService = new CustomerDetailSeriviceImp();

        CustomerDetailDTO customerDetailDTO = new CustomerDetailDTO("Anurag",105,"Anurag@gmail.com",2546087857L,"BTM Bengaluru");
        customerDetailService.validateAndSave(customerDetailDTO);
    }
}
