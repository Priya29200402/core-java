class AcidStore{
    Acid[] acidInfos;
    int currentIndex;

    AcidStore(Acid[] acidInfos){
        this.acidInfos=acidInfos;
    }

    void save(Acid acid){
        if (this.acidInfos != null && acid != null){
            System.out.println("Checking to store Acid Info");

            if (this.currentIndex < this.acidInfos.length){
                this.acidInfos[this.currentIndex]=acid;
                this.currentIndex++;
            } else{
                System.out.println("Array is full, cannot store more Acid Info");
            }
        } else{
            System.out.println("Acid array is null");
        }
    }
}