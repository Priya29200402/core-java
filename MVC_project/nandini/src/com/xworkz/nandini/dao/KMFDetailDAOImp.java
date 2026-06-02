package com.xworkz.nandini.dao;

import com.xworkz.nandini.dto.KMFDetailDTO;

public class KMFDetailDAOImp implements KMFDetailDAO{
    @Override
    public void save(KMFDetailDTO dto) {
        System.out.println("Running Save in KMF DetailDAO imp");
    }
}
