package com.xworkz.nandini.service;

import com.xworkz.nandini.dto.KMFDetailDTO;

public class KMFDetailServiceImpl implements KMFDetailService {
    @Override
    public void validateAndSave(KMFDetailDTO detailDTO) {
        System.out.println("Running Validate andd Save in KMF:"+detailDTO);
    }
}
