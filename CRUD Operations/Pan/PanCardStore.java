package com.xworkz.task3;


public class PanCardStore{
    PanCard[] pans;
    int currentIndex=0;

    PanCardStore(PanCard[] pans){
        this.pans=pans;
    }
    void store(PanCard pan){
        System.out.println("Executing Store in PanCardStore...");
        int indexSize = this.pans.length -1;

        if(pan != null){
            if(currentIndex <= indexSize){

                this.pans[currentIndex] = pan;

                currentIndex++;

            }else{
                System.out.println("The Pan array is full...");
            }
        }
    }
    void displayAll(){
        System.out.println("Displaying all the pan:");
        if(this.pans!= null){
            for (PanCard pan : this.pans) {
                if (pan != null) {
                    pan.displayInfo();
                }
            }
        }else{
            System.out.println("Pan array is null.");
        }

    }
    void getPanDetails(String number){
        System.out.println("Displaying Pan details  using Pan Number....");
        if(this.pans != null && number!= null){
            for(int i=0;i<currentIndex;i++){
                if(pans[i].panNumber == number){
                    this.pans[i].displayInfo();

                }
            }
        }else{
            System.out.println("The Pan array or number is null...");
        }
    }
    boolean updatePanAddress(String number,String newAddress){
        System.out.println("update Pan By  Address");
        System.out.println("name:"+number);

        if(this.pans != null && number!= null){
            for(int i=0;i<currentIndex;i++){
                if(pans[i].panNumber == number ){
                    this.pans[i].address = newAddress;
                    System.out.println("The updated Address:"+newAddress);
                    return true;
                }
            }
        }else{
            System.out.println("The array or Number is null....");
        }
        return false;
    }
}
