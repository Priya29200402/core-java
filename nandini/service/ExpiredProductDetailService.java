package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.ExpiredProductDetailDTO;

public interface ExpiredProductDetailService {
    void validateAndSave(ExpiredProductDetailDTO expiredProductDetailDTO);
}
