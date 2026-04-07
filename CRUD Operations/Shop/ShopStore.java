package com.xwrokz.task2;


public class ShopStore {
    Shop[] shops;
    int currentIndex=0;

    ShopStore(Shop[] shops){
        this.shops=shops;
    }
    void store(Shop shop){
        System.out.println("Executing Store in ShopStore...");
        int indexSize = this.shops.length -1;

        if(shop != null){
            if(currentIndex <= indexSize){

                this.shops[currentIndex] = shop;

                currentIndex++;

            }else{
                System.out.println("The shop array is full...");
            }
        }
    }
    void displayAll(){
        System.out.println("Displaying all the Shops:");
        if(this.shops!= null){
            for (Shop shop : this.shops) {
                if (shop != null) {
                    shop.displayInfo();
                }
            }
        }else{
            System.out.println("The shop array is null.");
        }

    }
    void getShopDetails(int id){
        System.out.println("Displaying Shop using shop Id....");
        if(this.shops != null && id!= 0){
            for(int i=0;i<currentIndex;i++){
                if(shops[i].shopId == id){
                    this.shops[i].displayInfo();

                }
            }
        }else{
            System.out.println("The shop array or id is null...");
        }
    }
    boolean updateShopWorkers(String name,int workers){
        System.out.println("update Shop By  No of Workers");
        System.out.println("name:"+name);

        if(this.shops != null && name!= null){
            for(int i=0;i<currentIndex;i++){
                if(shops[i].shopName == name ){
                    this.shops[i].noOfWorkers = workers;
                    System.out.println("The updated workers:"+workers);
                    return true;
                }
            }
        }else{
            System.out.println("The array or name is null....");
        }
        return false;
    }
}
