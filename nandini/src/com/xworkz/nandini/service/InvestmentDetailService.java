package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.InvestmentDetailDTO;

public interface InvestmentDetailService {
    boolean validateAndSave(InvestmentDetailDTO detailDTO);
}
