package com.xworkz.nandini.service;

import com.xworkz.nandini.dao.KMFDetailDAO;
import com.xworkz.nandini.dto.KMFDetailDTO;

public class KMFDetailServiceImp implements KMFDetailService {

    private KMFDetailDAO kmfDetailDAO;
    public KMFDetailServiceImp(KMFDetailDAO kmfDetailDAO) {
        this.kmfDetailDAO = kmfDetailDAO;
    }
    @Override
    public boolean validateAndSave(KMFDetailDTO dto) {
        System.out.println("Validating all required fields");

        if(dto.getLocation()!= null && dto.getLocation().length()>=3 && dto.getLocation().length()<=100 && dto.getLocation().matches("[A-Za-z ]+")){
            System.out.println("Valid Location");
        }else {
            System.out.println("Invalid Location");
            return false;
        }
        if(dto.getNoOfProduct() != 0 && dto.getNoOfProduct()>=200 && dto.getNoOfProduct()<= 500) {
            System.out.println("Valid No of Product");
        }else{
            System.out.println("Invalid No of Product");
            return false;
        }
        if(dto.getInstallationCost() != 0 && dto.getInstallationCost()>=200000 && dto.getInstallationCost()<= 7000000) {
            System.out.println("Valid Installation Cost");
        }else{
            System.out.println("Invalid Installation Cost");
            return false;
        }
        System.out.println("All required fields Validation is Completed");
        if(this.kmfDetailDAO!=null){
            System.out.println("KMFDetailDAO is not null we will save it"+dto);
            System.out.println("KMF Details Saved Successfully");
        }

        return false;
    }
}
