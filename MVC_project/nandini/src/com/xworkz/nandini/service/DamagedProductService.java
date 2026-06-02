package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.DamagedProductDetailDTO;

public interface DamagedProductService {
    boolean validateAndSave(DamagedProductDetailDTO detailDTO);

}
