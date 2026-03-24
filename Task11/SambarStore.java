class SambarStore{
    Sambar[] sambarInfos;
    int currentIndex;

    SambarStore(Sambar[] sambarInfos){
        this.sambarInfos=sambarInfos;
    }

    void save(Sambar sambar){
        if (this.sambarInfos != null && sambar != null){
         
            if (this.currentIndex < this.sambarInfos.length){
                this.sambarInfos[this.currentIndex]=sambar;
                this.currentIndex++;
            } else{
                System.out.println("Array is full, cannot store more Sambar Info");
            }
        } else{
            System.out.println("Sambar array is null");
        }
    }
}