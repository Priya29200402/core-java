package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.CustomerDetailDTO;

public class CustomerDetailSeriviceImp implements CustomerDetailService {
    @Override
    public void validateAndSave(CustomerDetailDTO customerDetailDTO) {
        System.out.println("Running validate and save to save the customer detail:"+ customerDetailDTO);
    }
}
