class GumStore{
    Gum[] gumInfos;
    int currentIndex;

    GumStore(Gum[] gumInfos){
        this.gumInfos = gumInfos;
    }

    void save(Gum gum){
        if (this.gumInfos != null && gum != null){
            System.out.println("Checking to store Gum Info");

            if (this.currentIndex < this.gumInfos.length){
                this.gumInfos[this.currentIndex] = gum;
                this.currentIndex++;
            } else{
                System.out.println("Array is full, cannot store more Gum Info");
            }
        } else{
            System.out.println("Gum array is null");
        }
    }
}