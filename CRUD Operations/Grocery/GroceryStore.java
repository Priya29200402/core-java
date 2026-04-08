package com.xworkz.task4;

public class GroceryStore{
    Grocery[] groceries;
    int currentIndex=0;

    GroceryStore(Grocery[] groceries){
        this.groceries=groceries;
    }
    void store(Grocery grocery){
        System.out.println("Executing Store in Grocery Store...");
        int indexSize = this.groceries.length -1;

        if(grocery != null){
            if(currentIndex <= indexSize){

                this.groceries[currentIndex] = grocery;

                currentIndex++;

            }else{
                System.out.println("The Grocery array is full...");
            }
        }
    }
    void displayAll(){
        System.out.println("Displaying all the Items:");
        if(this.groceries!= null){
            for (Grocery grocery : this.groceries) {
                if (grocery != null) {
                    grocery.displayInfo();
                }
            }
        }else{
            System.out.println("Grocery array is null.");
        }

    }
    void getGroceryDetails(int itemId){
        System.out.println("Displaying Item details  using id....");
        if(this.groceries != null && itemId!= 0){
            for(int i=0;i<currentIndex;i++){
                if(groceries[i].id == itemId){
                    this.groceries[i].displayInfo();

                }
            }
        }else{
            System.out.println("The  array or id  is null...");
        }
    }
    boolean updateItemPrice(String name,double itemPrice){
        System.out.println("update Item price By Name");
        System.out.println("name:"+name);

        if(this.groceries != null && name!= null){
            for(int i=0;i<currentIndex;i++){
                if(groceries[i].itemName == name ){
                    this.groceries[i].price = itemPrice;
                    System.out.println("The updated Price:"+itemPrice);
                    return true;
                }
            }
        }else{
            System.out.println("The array or Price is null....");
        }
        return false;
    }
}
