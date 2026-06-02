package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.CustomerDetailDTO;

public interface CustomerDetailService {
    boolean validateAndSave(CustomerDetailDTO customerDetailDTO);

}
