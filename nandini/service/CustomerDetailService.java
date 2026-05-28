package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.CustomerDetailDTO;

public interface CustomerDetailService {
    void validateAndSave(CustomerDetailDTO customerDetailDTO);
}
