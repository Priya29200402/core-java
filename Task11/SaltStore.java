class SaltStore{
    Salt[] saltInfos;
    int currentIndex;

    SaltStore(Salt[] saltInfos){
        this.saltInfos = saltInfos;
    }

    void save(Salt salt){
        if (this.saltInfos != null && salt != null){
            System.out.println("Checking to store Salt Info");

            if (this.currentIndex < this.saltInfos.length){
                this.saltInfos[this.currentIndex]=salt;
                this.currentIndex++;
            } else{
                System.out.println("Array is full, cannot store more Salt Info");
            }
        } else{
            System.out.println("Salt array is null");
        }
    }
}