package com.xworkz;

public class ToyStore {
    Toy[] toys;
    int currentIndex=0;

    ToyStore(Toy[] toys){
        this.toys=toys;
    }
    void store(Toy toy){
        System.out.println("The store method is executing  in class ToyInfo...");
        int indexSize = this.toys.length -1;

        if(toy != null){
            if(currentIndex <= indexSize){

                this.toys[currentIndex] = toy;

                currentIndex++;

            }else{
                System.out.println("The Toy array is full...");
            }
        }else{
            System.out.println("The Toy array is null...");
        }
    }
    void displayAll(){
        System.out.println("Displaying all the Toys:");
        if(this.toys!= null){
            for (Toy toy : this.toys) {
                if (toy != null) {
                    toy.displayInfo();
                }
            }
        }else{
            System.out.println("The Toy array is null.");
        }

    }
    void getProductDetails(int toyId){
        System.out.println("Displaying toy using toy Id....");
        if(this.toys != null && toyId!= 0){
            for(int i=0;i<currentIndex;i++){
                if(toys[i].id == toyId){
                    this.toys[i].displayInfo();
                    //System.out.println(product[i].display());
                }
            }
        }else{
            System.out.println("The Toy array or id is null...");
        }
    }
    boolean updateToyPrice(String toyName,double toyPrice){
        System.out.println("update Toy price using Toy Name");
        System.out.println(" name:"+toyName);

        if(this.toys != null && toyName!= null){
            for(int i=0;i<currentIndex;i++){
                if(toys[i].name == toyName ){
                    this.toys[i].price = toyPrice;
                    System.out.println("The updated price:"+toyPrice);
                    return true;
                }
            }
        }else{
            System.out.println("The array or name is null....");
        }
        return false;
    }
}
