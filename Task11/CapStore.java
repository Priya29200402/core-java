class CapStore{

    Cap[] caps;
    int currentIndex;

    CapStore(Cap[] caps){
        this.caps = caps;
    }

    void save(Cap cap){
      

        if (this.caps != null && cap != null){
            System.out.println("Checking to store Cap Info");

            if (this.currentIndex < this.caps.length){
               
                this.caps[this.currentIndex] = cap;
                this.currentIndex++;
            } else{
                System.out.println("Array is full, cannot store more CapInfo");
            }
        } else {
            System.out.println("Cap array is null");
        }
    }
}