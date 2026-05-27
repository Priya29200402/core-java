package com.xworkz.nandini.runner;

import com.xworkz.nandini.dto.KMFDetailDTO;
import com.xworkz.nandini.service.KMFDetailService;
import com.xworkz.nandini.service.KMFDetailServiceImpl;

public class KMFRunner {
    public static void main(String[] args) {
        KMFDetailService  kmfDetailService = new KMFDetailServiceImpl();
        KMFDetailDTO  kmfDetailDTO = new KMFDetailDTO("Bengaluru",12,6,"https://www.kmfnandini.coop/en",175);
        kmfDetailService.validateAndSave(kmfDetailDTO);
    }
}
