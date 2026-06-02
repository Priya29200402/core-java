package com.xworkz.nandini.runner;

import com.xworkz.nandini.dao.KMFDetailDAO;
import com.xworkz.nandini.dao.KMFDetailDAOImp;
import com.xworkz.nandini.dto.KMFDetailDTO;
import com.xworkz.nandini.service.KMFDetailService;
import com.xworkz.nandini.service.KMFDetailServiceImp;

public class KMFDetailRunner {
    public static void main(String[] args) {
        KMFDetailDAO kmfDetailDAO= new KMFDetailDAOImp();

        KMFDetailService kmfDetailService = new KMFDetailServiceImp(kmfDetailDAO);
        KMFDetailDTO kmfDetailDTO = new KMFDetailDTO("BTM Layout",200000,100000,"https://www.kmfnandini.coop/",300);

        kmfDetailService.validateAndSave(kmfDetailDTO);
    }
}
