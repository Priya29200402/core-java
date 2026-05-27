package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.OrderDetailDTO;

public interface OrderDetailService {
    void validateAndSave(OrderDetailDTO orderDetailDTO);
}
