class FarmerStore{
    Farmer[] farmerInfos;
    int currentIndex;

    FarmerStore(Farmer[] farmerInfos){
        this.farmerInfos = farmerInfos;
    }

    void save(Farmer farmer) {
        if (this.farmerInfos != null && farmer != null){
            System.out.println("Checking to store Farmer Info");

            if (this.currentIndex < this.farmerInfos.length){
                this.farmerInfos[this.currentIndex]=farmer;
                this.currentIndex++;
            } else{
                System.out.println("Array is full, cannot store more Farmer Info");
            }
        } else{
            System.out.println("Farmer array is null");
        }
    }
}