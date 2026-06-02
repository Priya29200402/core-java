package com.xworkz.nandini.service;

import com.xworkz.nandini.dao.CustomerDetailDAO;
import com.xworkz.nandini.dto.CustomerDetailDTO;

public class CustomerDetailServiceImp implements CustomerDetailService{
    private CustomerDetailDAO customerDetailDAO;
    public CustomerDetailServiceImp(CustomerDetailDAO customerDetailDAO){
        this.customerDetailDAO = customerDetailDAO;
    }

    @Override
    public boolean validateAndSave(CustomerDetailDTO customerDetailDTO) {
        System.out.println("Running validateAndSave..." + customerDetailDTO);

        String custName = customerDetailDTO.getCustomerName();
        if (custName != null && custName.length() >= 2 && custName.length() <= 100 && custName.matches("[a-zA-Z .]+")) {
            System.out.println("Valid Name...");
        } else {
            System.err.println("Invalid Name...");
            return false;
        }
        int custId = customerDetailDTO.getCustomerId();
        if(custId != 0 && custId>= 2 && custId <= 50){
            System.out.println("Valid ID...");
        }else {
            System.err.println("Invalid ID...");
            return false;
        }
        String custEmail = customerDetailDTO.getCustomerEmail();
        if(custEmail != null && custEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            System.out.println("Valid Email...");
        }else{
            System.err.println("Invalid Email...");
            return false;
        }
        long custPhone = customerDetailDTO.getCustomerPhone();
        if(custPhone != 0 && custPhone>= 1000000000L && custPhone <= 9999999999L){
            System.out.println("Valid Phone...");
        }else{
            System.err.println("Invalid Phone...");
            return false;
        }
        String custAddress = customerDetailDTO.getCustomerAddress();
        if(custAddress != null && custAddress.length()>=3 &&  custAddress.length()<=100){
            System.out.println("Valid Address...");
        }else{
            System.out.println("Invalid Address...");
            return false;
        }
        System.out.println("All Validation is Completed");
        if (this.customerDetailDAO != null) {
            System.out.println("customerDetailDAO is not null, will save it");
            this.customerDetailDAO.save(customerDetailDTO);
            System.out.println("Customer details Saved Successfully");
            return true;
        }
        return false;
    }

}
