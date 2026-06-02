package com.xworkz.nandini.service;

import com.xworkz.nandini.dao.DamagedProductDAO;
import com.xworkz.nandini.dto.DamagedProductDetailDTO;

public class DamagedProductServiceImp implements DamagedProductService{
    private DamagedProductDAO damagedProductDAO;
    public DamagedProductServiceImp(DamagedProductDAO damagedProductDAO){
        this.damagedProductDAO = damagedProductDAO;
    }
    @Override
    public boolean validateAndSave(DamagedProductDetailDTO detailDTO) {
        System.out.println("Validating all the required fields");

        String productName=detailDTO.getProductName();
        if(productName!=null && productName.length()>=3 &&  productName.length()<=100 && productName.matches("[a-zA-Z .]+")){
            System.out.println("Valid Product Name...");
        }else {
            System.out.println("Invalid Product Name");
            return false;
        }
        if(detailDTO.getProductCode()!= null && detailDTO.getProductCode().length()>=3 && detailDTO.getProductCode().length()<=10 &&  detailDTO.getProductCode().matches("[A-Za-z0-9]+")){
            System.out.println("Valid Product Code...");
        }else {
            System.out.println("Invalid Product Code");
            return false;
        }
        if(detailDTO.getProductCategory()!= null && detailDTO.getProductCategory().length()>=3 && detailDTO.getProductCategory().length()<=10 && detailDTO.getProductCategory().matches("[A-Za-z]+")){
            System.out.println("Valid Product Category...");
        }else {
            System.out.println("Invalid Product Category...");
            return false;
        }
        if(detailDTO.getProductDescription()!= null && detailDTO.getProductDescription().length()>=8 &&  detailDTO.getProductDescription().length()<=100 && detailDTO.getProductDescription().matches("[A-Za-z ]+")){
            System.out.println("Valid Product Description...");
        }else {
            System.out.println("Invalid Product Description...");
            return false;
        }
        System.out.println("All required fields Validation is Completed...");
        if(this.damagedProductDAO!= null){
            System.out.println("Damaged Product DAO is not null will save it...");
            this.damagedProductDAO.save(detailDTO);
            System.out.println("Damaged Product Details has been saved successfully...");
        }
        return false;
    }
}
