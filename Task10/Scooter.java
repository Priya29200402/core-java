class Scooter{

    String[] models;
    int currentIndex =0;

    Scooter(String[] models){
        this.models= models;
    }

    void save(String model){

        System.out.println("Executing save in Scooter");
        System.out.println("Scooter Model: " + model);

        if (this.models != null) {

            System.out.println("Checking to store Scooter model");

            if (this.currentIndex <= this.models.length - 1) {

                System.out.println("storing Scooter model in index :" + this.currentIndex);

                this.models[this.currentIndex] = model;

                this.currentIndex++;

                System.out.println("Stored the scooter model, next index to store next model: " + this.currentIndex);
            } 
            else {
                System.out.println("Array is full you cannot store more models");
            }

        } 
        else {
            System.out.println("models is not initialized with array");
        }
    }
}